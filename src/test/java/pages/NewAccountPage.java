package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccountPage {

    WebDriver webDriver;
    WebElement customerId;
    WebElement accountType;
    WebElement initialDeposit;
    WebElement submitButton;
    WebElement resetButton;

    public NewAccountPage(WebDriver webDriver) {
        this.webDriver=webDriver;
        this.customerId=webDriver.findElement(By.name("cusid"));
        this.accountType=webDriver.findElement(By.name("selaccount"));
        this.initialDeposit=webDriver.findElement(By.name("inideposit"));
        this.submitButton =webDriver.findElement(By.name("button2"));
        this.resetButton =webDriver.findElement(By.name("reset"));
    }

    public void crearNuevaCuenta(){
     customerId.sendKeys("");

    }
}

