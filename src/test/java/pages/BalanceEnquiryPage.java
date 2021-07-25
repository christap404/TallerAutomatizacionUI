package pages;

import models.Customer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BalanceEnquiryPage {
    WebElement accountNo;
    WebElement balance;
    WebElement submitButton;
    WebElement homeButton;
    WebDriver webDriver;

    public BalanceEnquiryPage (WebDriver webDriver){
        accountNo = webDriver.findElement(By.name("accountno"));
        submitButton = webDriver.findElement(By.name("AccSubmit"));
    }

    public void enviarCuenta(Customer customer){
        accountNo.sendKeys(customer.getAccountId());
        clickSubmit();
    }

    public void clickSubmit(){
        submitButton.click();
    }
}
