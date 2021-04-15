package pl.coderslab.pageobjectpatternexample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class MyStorePage {

    private WebDriver driver;

    @FindBy(name = "s")
    private WebElement inputSearchCatalogue;

    public MyStorePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchCatalogue(String searchQuery) {
        this.inputSearchCatalogue.click();
        this.inputSearchCatalogue.clear();
        this.inputSearchCatalogue.sendKeys(searchQuery);
        this.inputSearchCatalogue.submit();
    }

    public List<String> getDisplayedProductsNames() {
        List <WebElement> elems = this.driver.findElements(By.cssSelector("div.product-description a"));

        return elems.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
