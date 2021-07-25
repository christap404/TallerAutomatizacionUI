package pages;

import models.Customer;
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
    WebElement accountId;
    WebElement homeButton;

    public NewAccountPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.customerId = webDriver.findElement(By.name("cusid"));
        this.accountType = webDriver.findElement(By.name("selaccount"));
        this.initialDeposit = webDriver.findElement(By.name("inideposit"));
        this.submitButton = webDriver.findElement(By.name("button2"));
        this.resetButton = webDriver.findElement(By.name("reset"));
    }

    public void crearNuevaCuenta(Customer customer) {
        customerId.sendKeys(customer.getId());
        initialDeposit.sendKeys("500000");
        submitButton.click();
    }

    public String obtenerCuentaCreada(){
        accountId = webDriver.findElement(By.xpath("//*[@id=\"account\"]/tbody/tr[4]/td[2]"));
        return accountId.getText();
    }

    public void clickHome(){
        homeButton = webDriver.findElement(By.xpath("/html/body/p/a"));
        homeButton.click();
    }
}

