package ddacademy;

import AbstractComponent.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.By.cssSelector;

public class ProductCatelog extends AbstractComponent {

    WebDriver driver;

    public ProductCatelog(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //WebElement email= driver.findElement(By.id(""));

    //PageFactory ;
    @FindBy(css=".mb-3")
    List<WebElement> products;

    By productsBy=By.cssSelector(".mb-3");

    public List<WebElement> getProductsList()
    {
        WaitForElementToAppear(productsBy);
        return products;
    }

    public void getProductsByName(String ProductName)
    {

    }


}