package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/report/relatorios.json", "html:target/report/" },
        features = "src/test/resources/features",
        tags = {"@CT002"},
        glue = {"steps"}
)
public class Runner {
    public static WebDriver driver;
    @BeforeClass
    public static void start() {
        driver = new ChromeDriver();
    }
    @AfterClass
    public static void stop() {
        driver.quit();
    }
}
