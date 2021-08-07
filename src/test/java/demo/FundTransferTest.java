package demo;

import models.Customer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FundTransferPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NewCustomerPage;

import pages.*;


public class FundTransferTest {

    private WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;
    private FundTransferPage fundTransferPage;
    private NewAccountPage newAccountPage;
    private NewCustomerPage newCustomerPage;
    private BalanceEnquiryPage balanceEnquiryPage;
    BalanceDetailsPage balanceDetailsPage;

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

    @Test
    public void makeFoundTransfer() throws InterruptedException {
        Customer customer1;
        Customer customer2;
        String amount = "100";
        loginPage = new LoginPage(webDriver);
        loginPage.loguearse();
        homePage = new HomePage(webDriver);
        homePage.clickNewCustomer();

        newCustomerPage = new NewCustomerPage(webDriver);
        newCustomerPage.crearCustomer("pancho", "15", "12", "1996", "calle dinero",
                "la plata", "dinerolandia",  "123456", "183834672731",
                "domdimadom@gmail.com", "plata");
        Thread.sleep(500);
        customer1 = newCustomerPage.obtenerInfoCustomer();
        homePage = new HomePage(webDriver);
        homePage.clickNewAccount();
        newAccountPage = new NewAccountPage(webDriver);
        newAccountPage.crearNuevaCuenta(customer1);
        customer1.setAccountId(newAccountPage.obtenerCuentaCreada());
        newAccountPage.clickHome();
        homePage = new HomePage(webDriver);
        homePage.clickNewCustomer();
        newCustomerPage = new NewCustomerPage(webDriver);
        newCustomerPage.crearCustomer("heracles", "26", "04", "2000", "calle dolar",
                "el oro", "dubai", "4332443", "72872137832",
                "dubai@gmail.com", "oro");
        Thread.sleep(500);
        customer2 = newCustomerPage.obtenerInfoCustomer();
        homePage = new HomePage(webDriver);
        homePage.clickNewAccount();
        newAccountPage = new NewAccountPage(webDriver);
        newAccountPage.crearNuevaCuenta(customer2);
        customer2.setAccountId(newAccountPage.obtenerCuentaCreada());
        newAccountPage.clickHome();
        homePage = new HomePage(webDriver);
        homePage.fundTransferButton.click();
        FundTransferPage fundTransferPage = new FundTransferPage(webDriver);
        fundTransferPage.realizarFundTransfer(customer1, customer2, amount);
        fundTransferPage.clickHome();
        homePage = new HomePage(webDriver);
        homePage.clickBalanceEnquiry();
        balanceEnquiryPage = new BalanceEnquiryPage(webDriver);
        balanceEnquiryPage.enviarCuenta(customer1);
        balanceDetailsPage = new BalanceDetailsPage(webDriver);
        Thread.sleep(500);
        Assert.assertEquals(balanceDetailsPage.obtenerBalance(), "499900");
        balanceDetailsPage.clickHome();
        homePage = new HomePage(webDriver);
        homePage.clickBalanceEnquiry();
        balanceEnquiryPage = new BalanceEnquiryPage(webDriver);
        balanceEnquiryPage.enviarCuenta(customer2);
        balanceDetailsPage = new BalanceDetailsPage(webDriver);
        Thread.sleep(500);
        Assert.assertEquals(balanceDetailsPage.obtenerBalance(), "500100");

    }
}
