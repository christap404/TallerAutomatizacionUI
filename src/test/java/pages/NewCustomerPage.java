package pages;

import models.Customer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.xpath.XPath;
import java.util.Calendar;
import java.util.Date;

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
    public WebElement resetButton;
    public WebElement homeButton;


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
        resetButton = webDriver.findElement(By.name("res"));
    }

    public void crearCustomer(String nombre, String dia, String mes, String anno, String direccion,
                              String ciudad, String estado, String pin, String celular, String email, String contrasenna){
        Calendar cal = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        customerName.sendKeys(nombre);
        maleRadio.click();
        dateOfBirth.sendKeys(dia);
        dateOfBirth.sendKeys(mes);
        dateOfBirth.sendKeys(anno);
        address.sendKeys(direccion);
        city.sendKeys(ciudad);
        state.sendKeys(estado);
        this.pin.sendKeys(pin);
        mobileNumber.sendKeys(celular);
        this.email.sendKeys(String.valueOf(cal.DATE) +String.valueOf(cal.HOUR) + String.valueOf(cal.MINUTE)+String.valueOf(cal.SECOND) +email);
        password.sendKeys(contrasenna);
        submitButton.click();
    }

    public void resetearFormulario(){
        this.resetButton.click();
    }

    public void volverHome(){

    }

    public Customer obtenerInfoCustomer(){


        Customer customer = new Customer(
                webDriver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]")).getText(),
                webDriver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[5]/td[2]")).getText(),
                webDriver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[6]/td[2]")).getText(),
                webDriver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[7]/td[2]")).getText(),
                webDriver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[8]/td[2]")).getText(),
                webDriver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[9]/td[2]")).getText(),
                webDriver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[10]/td[2]")).getText(),
                webDriver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[11]/td[2]")).getText(),
                webDriver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[12]/td[2]")).getText(),
                webDriver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[13]/td[2]")).getText()
        );
        homeButton = webDriver.findElement(By.xpath("/html/body/p/a"));
        homeButton.click();
        return customer;
    }

}
