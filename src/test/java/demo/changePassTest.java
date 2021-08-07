package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.changePassword;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

public class changePassTest {

    private WebDriver webDriver;
    private LoginPage loginPage;
    private HomePage homePage;
    private changePassword changePassword;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "./src/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://demo.guru99.com/V4/index.php");

    }

    @Test
    public void changePass() throws InterruptedException {
        loginPage = new LoginPage(webDriver);
        loginPage.loguearse();
        System.out.println("HOLAAAAAAAAAA");
        WebElement welcomeMessage = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
        System.out.println(String.valueOf(welcomeMessage));
        Assert.assertEquals(welcomeMessage.getText(), "Manger Id : mngr342122");
        homePage = new HomePage(webDriver);
        homePage.clicChangePassword();
        webDriver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        changePassword = new changePassword(webDriver);
        changePassword.cambiarContrasena();
        webDriver.quit();
    }

    @Test
    public void changePassword() throws InterruptedException {
        //webDriver.get("http://demo.guru99.com/V4/index.php");
        homePage = new HomePage(webDriver);
        homePage.clicChangePassword();
    }
}
