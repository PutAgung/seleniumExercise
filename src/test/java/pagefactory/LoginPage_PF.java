/*
@CacheLookup, seperti namanya membantu kita mengontrol kapan WebElement perlu di-cache dan kapan tidak.
Anotasi ini, ketika diterapkan melalui WebElement, menginstruksikan Selenium untuk menyimpan cache WebElement alih-alih mencari WebElement setiap saat dari WebPage.
Ini membantu kita menghemat banyak waktu. Jangan digunakan kalau page objectnya berubah-ubah atau website yg menggunakan AJAX
 */

/*
untuk yg pakai AJAX, bisa menggunakan, sample::  PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);
 */



package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class LoginPage_PF {

    @FindBy(id = "name")
    @CacheLookup
    WebElement txt_usn;

    @FindBy(id = "password")
    WebElement txt_pwd;

    @FindBy(id = "login")
    WebElement btn_login;

    //====Webdriver===//
    WebDriver driver;
    public LoginPage_PF(WebDriver driver){
        PageFactory.initElements(driver,this);
        //PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);
    }


    public void enterUsername(String username) {
        txt_usn.sendKeys(username);
    }

    public void enterPassword(String password) {
        txt_pwd.sendKeys(password);
    }

    public void clickLogin() {
        btn_login.click();
    }

}
