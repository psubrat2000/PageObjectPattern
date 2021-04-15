package pl.coderslab.pageobjectpatternexample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreAddressPage {

    private WebDriver driver;

    @FindBy(name = "firstname")
    private WebElement firstName;

    @FindBy(name = "lastname")
    private WebElement lastName;

    @FindBy(name = "address1")
    private WebElement address1;

    @FindBy(name = "postcode")
    private WebElement postcode;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "id_country")
    private WebElement id_country;

    @FindBy(css = "button.btn.btn-primary.float-xs-right")
    private WebElement save;

    public MyStoreAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        this.firstName.clear();
        this.firstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    public void enterAddress(String address) {
        this.address1.clear();
        this.address1.sendKeys(address);
    }

    public void enterPostCode(String postCode) {
        this.postcode.clear();
        this.postcode.sendKeys(postCode);
    }

    public void enterCity(String city) {
        this.city.clear();
        this.city.sendKeys(city);
    }

    public void complete() {
        this.id_country.sendKeys("United Kingdom");
        this.save.click();
    }

    public String getSuccessMessage() {
        WebElement successMessage = this.driver.findElement(By.cssSelector("article.alert.alert-success li"));
        return successMessage.getText();
    }
}
