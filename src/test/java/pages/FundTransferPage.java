package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FundTransferPage {
    public WebElement payersAccountNo;
    public WebElement payeesAccountNo;
    public WebElement amount;
    public WebElement description;
    public WebElement submit;
    public WebElement reset;
    public WebDriver webDriver;

    public FundTransferPage(WebDriver webDriver){
        this.webDriver = webDriver;
        payersAccountNo = webDriver.findElement(By.name("payersaccount"));
        payeesAccountNo = webDriver.findElement(By.name("payeeaccount"));
        amount = webDriver.findElement(By.name("ammount"));
        description = webDriver.findElement(By.name("desc"));
        submit = webDriver.findElement(By.name("AccSubmit"));
        reset = webDriver.findElement(By.name("res"));
    }

    public void llenarFormularioSinPayeesAccount(){
        payersAccountNo.sendKeys("123");
        amount.sendKeys("123");
        description.sendKeys("test");
    }

    public void clickSubmit(){
        this.submit.click();
    }
}
