package com.google.home.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    @FindBy(xpath = "//input[@title=\"Search\"]")
    public WebElement searchBox;

    @FindBy(xpath = "(//input[@name='btnK' and @value='Google Search'])[2]")
    public WebElement searchButton;

    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * This method clicks on the search box on Google Home page
     *
     * @return NA
     * @throws Exception
     * @author Manindra
     */
    @SuppressWarnings("JavaDoc")
    public void searchBoxClick() throws Exception {
        try {
            searchBox.click();
        } catch (Exception exception) {
            throw new Exception("Unable to click on Search Box");
        }
    }

    /**
     * This method clicks on the search button on Google Home page
     *
     * @return NA
     * @throws Exception
     * @author Manindra
     */
    @SuppressWarnings("JavaDoc")
    public void searchButtonClick() throws Exception {
        try {
            searchButton.click();
        } catch (Exception exception) {
            throw new Exception("Unable to click on Search Button");
        }
    }


}

