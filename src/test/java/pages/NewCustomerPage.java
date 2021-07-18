package pages;

import models.Customer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCustomerPage {
    public WebElement customerName;
    public WebElement maleRadio;
    public WebElement femaleRadio;
    public WebElement dateOfBirth;
    public WebElement address;
    public WebElement city;
    public WebElement state;
    public WebElement pin;
    public WebElement mobileNumber;
    public WebElement email;
    public WebElement password;
    public WebElement submitButton;
    public WebDriver webDriver;


    public NewCustomerPage(WebDriver webDriver){
        this.webDriver = webDriver;
        customerName = webDriver.findElement(By.name("name"));
        maleRadio = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]"));
        femaleRadio = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]"));
        dateOfBirth = webDriver.findElement(By.name("dob"));
        address = webDriver.findElement(By.name("addr"));
        city = webDriver.findElement(By.name("city"));
        state = webDriver.findElement(By.name("state"));
        pin = webDriver.findElement(By.name("pinno"));
        mobileNumber = webDriver.findElement(By.name("telephoneno"));
        email = webDriver.findElement(By.name("emailid"));
        password = webDriver.findElement(By.name("password"));
        submitButton = webDriver.findElement(By.name("sub"));
    }

    public void crearCustomer(){
        customerName.sendKeys("pancho plata");
        maleRadio.click();
        dateOfBirth.sendKeys("23");
        dateOfBirth.sendKeys("11");
        dateOfBirth.sendKeys("1996");
        address.sendKeys("calle signo dinero");
        city.sendKeys("dinerolandia");
        state.sendKeys("doular");
        pin.sendKeys("123");
        mobileNumber.sendKeys("31234566");
        email.sendKeys("dinero@capitalismo.com");
        password.sendKeys("dinero");
        submitButton.click();
    }

    public Customer obtenerInfoCustomer(){
        Customer customer = new Customer(

        );
        return customer;
    }

}
