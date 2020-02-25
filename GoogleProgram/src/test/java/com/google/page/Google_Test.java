package com.google.page;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@acceptance",
        features = {"src\\test\\resources\\com\\google\\programming\\googleProgramming.feature"},
        glue = {"com.google.page"},
        dryRun = false,
        monochrome = true,
        strict = true)

public class Google_Test {

}
