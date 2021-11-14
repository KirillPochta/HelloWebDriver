import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Level;
import java.util.logging.Logger;
public class ManualTest {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://junior.webquik.ru/");
        driver.findElement(By.xpath("//*[@id=\"textfield-1015-inputEl\"]")).sendKeys("U0191767");
        driver.findElement(By.xpath("//*[@id=\"textfield-1017-inputEl\"]")).sendKeys("06258");
        driver.findElement(By.xpath("//*[@id=\"button-1021-btnIconEl\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"button-1050-btnIconEl\"]")).click();
        driver.findElement(By.name("combobox-2022-inputEl")).sendKeys(Keys.ARROW_DOWN + "\n");
        Thread.sleep(1000);
        WebElement inpupValueOfLot = driver.findElement(By.xpath("//*[@id=\"combobox-2024-inputEl\"]"));
        inpupValueOfLot.sendKeys("CHFRUBTODTOM  CHF_TODTOM  (CETS  МБ Валюта: ЕТС)");
        inpupValueOfLot.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"plusminusnumberfield-2032-inputEl\"]")).sendKeys("20");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"plusminusnumberfield-2056-inputEl\"]")).sendKeys("2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submitBtn2-btnIconEl\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"button-2203\"]")).click();
    }
}
