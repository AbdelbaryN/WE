package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_Home {

    private final By logoutBTN = By.linkText("Logout");
    private WebDriver driver;

    public P02_Home(WebDriver driver) {
        this.driver = driver;
    }


    public void ClickOnLogout(){
        driver.findElement(logoutBTN).click();
    }

}
