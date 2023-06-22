package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
public class NavigateButtonsTest {
        @Test
        public void testLogInPositive(){
            //System.setProperty("webdriver.chrome.driver","D:\\QA\\webdriver\\chromedriver.exe");
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(option);
            //WebDriverManager.chromedriver().setup();
            //WebElement element = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#user-name12121")));
            driver.get("https://demoqa.com/elements");


            driver.findElement(By.id("item-4")).click();
            WebElement element = new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.id("8ArqW")));
            driver.findElement(By.id("8ArqW")).click();
            WebElement element1 = new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#dynamicClickMessage")));
            //Assert.assertEquals("You selected a context menu",alert.getText());
//        String urlActual = driver.getCurrentUrl();
            //WebElement clickable =
                    //driver.findElement(By.id("item-4"));
            //new Actions(driver).click(clickable).perform();
            //Web element = new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#hobR3")));

            //Assert.assertEquals("You selected a context menu",alert.getText());

//        Assert.assertEquals(urlActual, "https://www.saucedemo.com/inventory.html",
//                "The url is wrong");

            //String titleText = driver.findElement(By.cssSelector(".app_logo")).getText();
            //Assert.assertEquals(titleText, "Swag Labs");

            driver.close();
            driver.quit();
        }
    }
