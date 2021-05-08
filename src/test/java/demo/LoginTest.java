package demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {

    private WebDriver webDriver;
    private LoginPage loginPage;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "./src/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://demo.guru99.com/V4/index.php");
        loginPage = new LoginPage(webDriver);
    }

    @Test
    public void login() throws InterruptedException {
        loginPage.loguearse();
        WebElement welcomeMessage = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
        Assert.assertEquals(welcomeMessage.getText(), "Manger Id : mngr325498");
    }

}
