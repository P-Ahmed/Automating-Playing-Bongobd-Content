import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class PlayingContentAutomatically {
    WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxOptions ops = new FirefoxOptions();
        ops.addArguments("--headed");
        //ops.addArguments("--headless");//for not opening browser
        driver = new FirefoxDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void Test1() throws InterruptedException {

        driver.get("https://bongobd.com/");
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Black");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='MuiGrid-root-631 MuiGrid-item-633 MuiGrid-zeroMinWidth-634 MuiGrid-grid-xs-8-673']")).click();
        Thread.sleep(5000);

    }
    @After
    public void finishTest(){
        driver.close();
    }
}
