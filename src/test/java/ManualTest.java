import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManualTest {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://junior.webquik.ru/");
        driver.findElement(By.xpath("//*[@id=\"textfield-1015-inputEl\"]")).sendKeys("U0191767");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"textfield-1017-inputEl\"]")).sendKeys("06258");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"button-1021-btnIconEl\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"button-1050-btnIconEl\"]")).click();
        driver.findElement(By.name("combobox-2022-inputEl")).sendKeys(Keys.ARROW_DOWN + "\n");
        Thread.sleep(1000);
        WebElement inpupValueOfLot = driver.findElement(By.xpath("//*[@id=\"combobox-2024-inputEl\"]"));
        inpupValueOfLot.sendKeys("CNYRUB_FWD  CNYRUB_LTV  (CETS  МБ Валюта: ЕТС)");
        inpupValueOfLot.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"plusminusnumberfield-2032-inputEl\"]")).sendKeys("5");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"plusminusnumberfield-2056-inputEl\"]")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submitBtn2-btnIconEl\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"button-2203\"]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
