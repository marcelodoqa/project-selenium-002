package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Utils;

public class LoginPage extends Utils {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarSite() {
        driver.get("https://barrigareact.wcaquino.me");

    }

    public void fillEmail(String email)
    {
        esperarElementoAparecer(By.cssSelector("[data-test='passwd']"), 3);
        driver.findElement(By.cssSelector("[data-test='email']")).sendKeys(email);
    }

    public void fillPaswd(String senha) {

        driver.findElement(By.cssSelector("[data-test='passwd']")).sendKeys(senha);
    }

    public void clickBtn() {

        driver.findElement(By.cssSelector("button.btn.btn-block.btn-primary")).click();
        esperarElementoAparecer(By.cssSelector(".toast-message"), 2);
    }
}
