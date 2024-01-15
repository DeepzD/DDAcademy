package AbstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//Reusable codes are here
public class AbstractComponent {

    WebDriver driver;

    public AbstractComponent(WebDriver driver)
    {
        this.driver=driver;
    }

    public void WaitForElementToAppear(By findby)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(findby));
    }

}
