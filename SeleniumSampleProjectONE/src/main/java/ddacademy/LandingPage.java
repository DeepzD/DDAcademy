package ddacademy;

import AbstractComponent.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponent {

   WebDriver driver;

   public LandingPage(WebDriver driver)
   {
       super(driver);
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }
    //WebElement email= driver.findElement(By.id(""));

    //PageFactory
    @FindBy(id="userEmail")
    WebElement txt_Useremail;

    @FindBy(id="userPassword")
    WebElement txt_userPassword;

    @FindBy(id="login")
    WebElement btn_login;

    public void loginToApplication(String email,String password)
    {
        txt_Useremail.sendKeys(email);
        txt_userPassword.sendKeys(password);
        btn_login.click();
    }

}
