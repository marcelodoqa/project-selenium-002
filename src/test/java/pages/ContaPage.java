package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import suport.Utils;

public class ContaPage extends Utils {
    WebDriver driver;

    public ContaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillAccount(String account) {
        driver.findElement(By.cssSelector("[data-test='nome']")).sendKeys(account);
    }

    public void clickBtnAccount() {
        driver.findElement(By.cssSelector(".btn")).click();
    }
    public void checkAccount(String accountName) {
        WebElement novaConta = driver.findElement(By.xpath("//table/tbody/tr/td[text()='New account CT002.1']"));
        Assert.assertTrue(novaConta.isDisplayed());
    }
}
