package pl.coderslab.pageobjectpatternexample.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class MyStoreProductSearchTest {
    private WebDriver driver;
    private MyStorePage myStorePage;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://prod-kurs.coderslab.pl/index.php");
        this.myStorePage = new MyStorePage(this.driver);
    }

    @Test
    public void shouldSearchOnlyProductsContainingSearchQuery() {
        this.myStorePage.searchCatalogue("Mug");
        List<String> displayedProductNames = this.myStorePage.getDisplayedProductsNames();
        assertNotEquals(0, this.myStorePage.getDisplayedProductsNames());
    }
}
