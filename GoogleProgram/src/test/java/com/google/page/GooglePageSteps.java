package com.google.page;

import com.google.home.page.ConfigFileReader;
import com.google.home.page.GoogleConstants;
import com.google.home.page.GooglePage;
import com.google.utility.StatefulSingleton;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;


public class GooglePageSteps {
    private static WebDriver driver;
    private static GooglePage googlePage;

    public GooglePageSteps() {
        driver = StatefulSingleton.instance().getDriver();
    }

    @After
    public static void closeBrowser() {
        driver.close();
    }

    public static void highLighterMethod(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }

    public static void openUrlInnewTab(String Url) {

        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(Url.trim());
        System.out.println("Page Title : " + driver.getTitle());
        driver.close();
        driver.switchTo().window(tabs.get(0)); // switch back to main screen
    }

    @Before
    public void launchBrower() {

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ConfigFileReader configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @Given("^User open's Google Chrome browser and enters \"([^\"]*)\"$")
    public void User_opens_Google_Chrome(String arg1) {
        googlePage = new GooglePage(driver);
        driver.get(GoogleConstants.URL);
    }

    @And("User clicks on \"([^\"]*)\" box field")
    public void userClicksOnBoxField(String arg0) throws Exception {
        googlePage.searchBoxClick();

    }

    @And("User enters \"([^\"]*)\" Text in Search box text field")
    public void userEntersTextInSearchBoxTextField(String arg0) {
        googlePage.searchBox.sendKeys(arg0);
        googlePage.searchBox.sendKeys(Keys.TAB);
    }

    @When("User clicks on \"([^\"]*)\" button")
    public void userClicksOnButton(String arg0) throws Exception {
        highLighterMethod(driver.findElement(By.xpath(("(//input[@name='btnK' and @value='Google Search'])[2]"))));
        googlePage.searchButtonClick();
    }

    @Then("User will get list of Links for the entered search criteria and User will remove \"([^\"]*)\" from the list and User will print the \"([^\"]*)\" and \"([^\"]*)\" of the result one after the other opening in new tab")
    public void userWillGetListOfLinksForTheEnteredSearchCriteriaAndUserWillRemoveFromTheListAndUserWillPrintTheAndOfTheResultOneAfterTheOtherOpeningInNewTab(String arg0, String arg1, String arg2) {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        List<WebElement> activelist = new ArrayList<>();
        for (WebElement link : links) {

            if (link.getAttribute("href") != null) {
                activelist.add(link);
            }
        }
        System.out.println("Active Urls : " + activelist.size());
        activelist.stream()
                .filter(element -> !element.getText().startsWith("Ad")
                        && !element.getAttribute("href").contains("google.com/maps") && !element.getAttribute("href").contains("adurl="))
                .forEach(element -> {
                    System.out.println("Url text : " + element.getText());
                    System.out.println("URL      : " + element.getAttribute("href"));
                    openUrlInnewTab(element.getAttribute("href"));
                });
    }

}
