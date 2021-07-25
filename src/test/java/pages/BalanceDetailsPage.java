package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BalanceDetailsPage {
    WebElement balance;
    WebDriver webDriver;
    WebElement homeButton;

    public BalanceDetailsPage(WebDriver webDriver){
        balance = webDriver.findElement(By.xpath("//*[@id=\"balenquiry\"]/tbody/tr[16]/td[2]"));
        homeButton = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td/p/a"));
    }

    public String obtenerBalance(){
        return balance.getText();
    }

    public void clickHome(){
        homeButton.click();
    }
}
