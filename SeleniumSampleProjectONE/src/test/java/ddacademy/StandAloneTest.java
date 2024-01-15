package ddacademy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class StandAloneTest {

    public static void main(String args[])
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/client");

        /*driver.findElement(By.id("userEmail")).sendKeys("ddpinkygirl@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Dd@12345");

        driver.findElement(By.id("login")).click();*/

        LandingPage landingPage=new LandingPage(driver);
        landingPage.loginToApplication("ddpinkygirl@gmail.com","Dd@12345");

       /* List<WebElement> products =driver.findElements(By.cssSelector(".mb-3"));

        WebElement prod=products.stream().filter(product->product.findElement(By.cssSelector("b"))
                .getText().equals("ZARA COAT 3")).findFirst().orElse(null);

        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
*/
      /*  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("toast-container")));

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("toast-container")));

        driver.findElement(By.cssSelector("[routerlink*='cart']")).click();*/
    }
}
