package pl.coderslab.pageobjectpatternexample.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class MyStoreAddressTest {
    private WebDriver driver;
    private MyStoreAddressPage myStoreAddressPage;

    @Given("an open browser with MyStore address page")
    public void openStoreAddressPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://prod-kurs.coderslab.pl/index.php?controller=address");
        this.myStoreAddressPage = new MyStoreAddressPage(this.driver);
    }

    @When("user enters first name (.*)")
    public void shouldEnterFirstName(String firstName) {
        this.myStoreAddressPage.enterFirstName(firstName);
    }

    @And("user enters last name (.*)")
    public void shouldEnterLastName(String lastName) {
        this.myStoreAddressPage.enterLastName(lastName);
    }

    @And("user enters address (.*)")
    public void shouldEnterAddress(String address) {
        this.myStoreAddressPage.enterAddress(address);
    }

    @And("user enters postcode (.*)")
    public void shouldEnterPostcode(String postcode) {
        this.myStoreAddressPage.enterPostCode(postcode);
    }

    @And("user enters city (.*)")
    public void shouldEnterCity(String city) {
        this.myStoreAddressPage.enterCity(city);
    }

    @And("form is submitted")
    public void shouldSubmit() {
        this.myStoreAddressPage.complete();
    }

    @Then("success message is printed")
    public void successMessageIsPrinted() {
    assertEquals("Address successfully added!", this.myStoreAddressPage.getSuccessMessage());
    System.out.println(this.myStoreAddressPage.getSuccessMessage());
    }
}