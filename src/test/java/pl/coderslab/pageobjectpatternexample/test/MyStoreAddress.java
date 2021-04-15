package pl.coderslab.pageobjectpatternexample.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/Cucumber/Features/MyStoreAddress", plugin = {"pretty", "html:out.html"})

public class MyStoreAddress {
}