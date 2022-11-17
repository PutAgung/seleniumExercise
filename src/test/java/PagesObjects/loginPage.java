package PagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    protected WebDriver driver;
    final By txt_username = By.id("name");
    final By txt_password = By.id("password");
    final By btn_login = By.id("login");
    final By btn_logout = By.id("logout");

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }
    public void checkLogOutIsDisplayed(){
        driver.findElement(btn_logout).isDisplayed();
    }

    //bisa pakai ini juga
//    public void loginValidUser(String username, String password){
//        driver.findElement(txt_username).sendKeys(username);
//        driver.findElement(txt_password).sendKeys(password);
//        driver.findElement(btn_login).click();
//    }
}
