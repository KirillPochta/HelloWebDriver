import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Quiktest {
    @Test
    public static void main(String[] args) throws InterruptedException {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://junior.webquik.ru/");
            //Set implicit wait:
            //wait for WebElement
            driver.manage().timeouts().implicitlyWait(5000,
                    TimeUnit.MILLISECONDS);
            //wait for loading page
            driver.manage().timeouts().pageLoadTimeout(10000,
                    TimeUnit.MILLISECONDS);
            //wait for an asynchronous script to finish execution
            driver.manage().timeouts().setScriptTimeout(5000,
                    TimeUnit.MILLISECONDS);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"textfield-1015-inputEl\"]")).sendKeys("U0191767");
            driver.findElement(By.xpath("//*[@id=\"textfield-1017-inputEl\"]")).sendKeys("06258");
            driver.findElement(By.xpath("//*[@id=\"button-1021-btnIconEl\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"button-1050-btnIconEl\"]")).click();
            driver.findElement(By.name("combobox-2022-inputEl")).sendKeys(Keys.ARROW_DOWN + "\n");
            WebElement inpupValueOfLot = driver.findElement(By.xpath("//*[@id=\"combobox-2024-inputEl\"]"));
            inpupValueOfLot.sendKeys("CNYRUB_FWD  CNYRUB_LTV  (CETS  МБ Валюта: ЕТС)");
            inpupValueOfLot.sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//*[@id=\"plusminusnumberfield-2032-inputEl\"]")).sendKeys("5");
            driver.findElement(By.xpath("//*[@id=\"plusminusnumberfield-2056-inputEl\"]")).sendKeys("1");
            driver.findElement(By.xpath("//*[@id=\"submitBtn2-btnIconEl\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"button-2203\"]")).click();
            driver.quit();
        }
        catch (Exception e) {Logger logger = Logger.getLogger(Quiktest.class.getName());
            logger.log(Level.INFO,e.getMessage());}
        }
    }
}
