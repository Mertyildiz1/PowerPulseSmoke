package PowerPulseSmokeTest;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class PowerPulseSmokeTest extends TestBase {

    @Test
    public void mevcutHesapGiris(){

        driver.get("https://power-pulse-qa.f.goit.study/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
        signInButton.click();
        bekle(3);

        WebElement emailInput = driver.findElement(By.xpath("//input"));
        emailInput.sendKeys("testpowerpulse@gmail.com",Keys.TAB);
        bekle(2);

        WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
        passwordInput.sendKeys("123456Aa");
        bekle(2);

        WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
        signInButton2.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://power-pulse-qa.f.goit.study/diary"));

        WebElement dashboardElement = driver.findElement(By.xpath("//a[@class='UserNav_link__9pIje ']"));
        assertTrue(dashboardElement.isDisplayed());
        bekle(2);

        driver.quit();


    }




}
