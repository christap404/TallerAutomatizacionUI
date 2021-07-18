package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    public WebDriver webDriver;
    public WebElement userBox;
    public WebElement password;
    public WebElement loginButton;

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.userBox = webDriver.findElement(By.name("uid"));
        this.password = webDriver.findElement(By.name("password"));
        this.loginButton = webDriver.findElement(By.name("btnLogin"));
    }

    public void loguearse(){
        userBox.sendKeys("mngr342122");
        password.sendKeys("jApatYd");
        loginButton.click();

        WebElement welcomeMessage = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
    }
}
