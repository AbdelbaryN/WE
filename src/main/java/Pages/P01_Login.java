package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_Login {

    private WebDriver driver;


    final By username = By.id("username");
    final By password = By.id("password");
    final By loginButton = By.className("radius");

    public P01_Login(WebDriver driver) {
        this.driver = driver;
    }


    public P01_Login EnterUsername(String usernameTxt){
        driver.findElement(username).sendKeys(usernameTxt);
        return this;
    }

    public P01_Login EnterPassword(String passwordTxt){
        driver.findElement(password).sendKeys(passwordTxt);
        return this;
    }

    public P02_Home ClickOnLogin(){
        driver.findElement(loginButton).click();
        return new P02_Home(driver);
    }


}
