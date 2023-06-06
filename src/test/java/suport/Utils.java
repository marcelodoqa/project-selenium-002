package suport;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.Runner;

public class Utils extends Runner {
    public void esperarElementoAparecer(By elemento, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }
    public void logout() {
        driver.findElement(By.cssSelector("[data-test='menu-settings']")).click();
        driver.findElement(By.xpath("//div[1]/nav/div/ul/li[4]/div/a[3]")).click();
    }
    public void avisoMessage(String msg) {
//        Assert.assertTrue("By.cssSelector('toast-message')", true);
        String element = driver.findElement(By.cssSelector(".toast-message")).getText();


        Assert.assertTrue(element.contains(msg));
    }
    public void login() {
        driver.get("https://barrigareact.wcaquino.me");
        driver.findElement(By.cssSelector("[data-test='email']")).sendKeys("marcelo@mail.com");
        driver.findElement(By.cssSelector("[data-test='passwd']")).sendKeys("senha123");
        driver.findElement(By.cssSelector("button.btn.btn-block.btn-primary")).click();
    }
    public void paginaConta() {
        driver.findElement(By.cssSelector("[data-test='menu-settings']")).click();
        driver.findElement(By.xpath("//div[1]/nav/div/ul/li[4]/div/a[1]")).click();
    }
}
