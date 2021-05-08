package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver webDriver;
    public WebElement fundTransferButton;
    public WebElement newCustomerButton;

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
        fundTransferButton = webDriver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        newCustomerButton = webDriver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a"));
    }

    public void clickFundTransfer(){
        fundTransferButton.click();
    }

    public void clickNewCustomer() { newCustomerButton.click(); }
}
