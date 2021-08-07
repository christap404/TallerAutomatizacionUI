package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver webDriver;
    public WebElement fundTransferButton;
    public WebElement newCustomerButton;

    public WebElement changePassword;

    public WebElement newAccountButton;
    public WebElement balanceEnquiry;


    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        fundTransferButton = webDriver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        newCustomerButton = webDriver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a"));
        changePassword = webDriver.findElement(By.xpath("/html/body/div[3]/div/ul/li[11]/a"));//
        newAccountButton = webDriver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
        balanceEnquiry = webDriver.findElement(By.xpath("/html/body/div[3]/div/ul/li[12]/a"));

    }

    public void clickFundTransfer() {
        fundTransferButton.click();
    }

    public void clickNewCustomer() {
        newCustomerButton.click();
    }


    public void clicChangePassword(){
        changePassword.click();
    }

    public void clickNewAccount() {
        newAccountButton.click();
    }

    public void clickBalanceEnquiry(){
        balanceEnquiry.click();

    }
}
