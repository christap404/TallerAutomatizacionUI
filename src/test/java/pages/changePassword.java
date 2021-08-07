package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class changePassword {

    public WebDriver webDriver;
    public WebElement oldPassword;
    public WebElement newPassword;
    public WebElement confirmNewPassword;
    public WebElement btnSubmit;


    public changePassword (WebDriver webDriver){
        this.webDriver = webDriver;
        oldPassword = webDriver.findElement(By.name("oldpassword"));
        newPassword = webDriver.findElement(By.name("newpassword"));
        confirmNewPassword = webDriver.findElement(By.name("confirmpassword"));
        btnSubmit = webDriver.findElement(By.name("sub"));
    }

    public void cambiarContrasena (){
        oldPassword.sendKeys("jApatYd@1@@");
        newPassword.sendKeys("jApatYd@1@@@");
        confirmNewPassword.sendKeys("jApatYd@1@@@");
        btnSubmit.click();
    }
}
