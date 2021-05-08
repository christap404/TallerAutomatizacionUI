package demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FundTransferPage;
import pages.HomePage;
import pages.LoginPage;

public class FundTransferTest {

    private WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;
    private FundTransferPage fundTransferPage;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "./src/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://demo.guru99.com/V4/index.php");

    }

    @Test
    public void payeesAccountNoObligatoriedad() throws InterruptedException {
        loginPage = new LoginPage(webDriver);
        loginPage.loguearse();
        homePage = new HomePage(webDriver);
        homePage.clickFundTransfer();
        fundTransferPage = new FundTransferPage(webDriver);
        fundTransferPage.llenarFormularioSinPayeesAccount();
        fundTransferPage.clickSubmit();
        Assert.assertEquals(webDriver.switchTo().alert().getText(), "Please fill all fields");
    }
}
