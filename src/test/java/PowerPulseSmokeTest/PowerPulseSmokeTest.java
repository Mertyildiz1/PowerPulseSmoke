package PowerPulseSmokeTest;

import org.junit.Assert;
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

        WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
        signInButton.click();

        WebElement emailInput = driver.findElement(By.xpath("//input"));
        emailInput.sendKeys("testpowerpulse@gmail.com",Keys.TAB);

        WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
        passwordInput.sendKeys("123456Aa");

        WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
        signInButton2.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://power-pulse-qa.f.goit.study/diary"));

        WebElement dashboardElement = driver.findElement(By.xpath("//a[@class='UserNav_link__9pIje ']"));
        assertTrue(dashboardElement.isDisplayed());

        bekle(2);
        driver.quit();
    }

        @Test
        public void diaryButton() {
        driver.get("https://power-pulse-qa.f.goit.study/");

        WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
        signInButton.click();

        WebElement emailInput = driver.findElement(By.xpath("//input"));
        emailInput.sendKeys("testpowerpulse@gmail.com", Keys.TAB);

        WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
        passwordInput.sendKeys("123456Aa");

        WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
        signInButton2.click();

        WebElement diaryButton = driver.findElement(By.xpath("(//a[@class='UserNav_link__9pIje UserNav_activeLink__1H8TJ active'])[1]"));

        Assert.assertTrue("Diary butonu aktif değil.", diaryButton.isDisplayed() && diaryButton.isEnabled());

        bekle(2);
        driver.quit();
    }

        @Test
        public void productsButton() {
            driver.get("https://power-pulse-qa.f.goit.study/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
            signInButton.click();

            WebElement emailInput = driver.findElement(By.xpath("//input"));
            emailInput.sendKeys("testpowerpulse@gmail.com", Keys.TAB);

            WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
            passwordInput.sendKeys("123456Aa");

            WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
            signInButton2.click();

            WebElement productsButton = driver.findElement(By.xpath("(//a[@class='UserNav_link__9pIje '])[1]"));

            Assert.assertTrue("Product butonu aktif değil", productsButton.isDisplayed() && productsButton.isEnabled());

            bekle(2);
            driver.quit();
        }
        @Test
        public void exercisesButton() {
            driver.get("https://power-pulse-qa.f.goit.study/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
            signInButton.click();

            WebElement emailInput = driver.findElement(By.xpath("//input"));
            emailInput.sendKeys("testpowerpulse@gmail.com", Keys.TAB);

            WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
            passwordInput.sendKeys("123456Aa");

            WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
            signInButton2.click();

            WebElement exercisesButton = driver.findElement(By.xpath("(//a[@class='UserNav_link__9pIje '])[2]"));

            Assert.assertTrue("Exercises butonu aktif değil", exercisesButton.isDisplayed() && exercisesButton.isEnabled());

            bekle(2);
            driver.quit();
        }

        @Test
        public void düzenlemeSimgesiButton() {
            driver.get("https://power-pulse-qa.f.goit.study/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
            signInButton.click();

            WebElement emailInput = driver.findElement(By.xpath("//input"));
            emailInput.sendKeys("testpowerpulse@gmail.com", Keys.TAB);

            WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
            passwordInput.sendKeys("123456Aa");

            WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
            signInButton2.click();

            WebElement düzenlemeSimgesiButton = driver.findElement(By.xpath("//a[@href='/profile']"));

            Assert.assertTrue("Düzenleme simgesi butonu aktif değil", düzenlemeSimgesiButton.isDisplayed() && düzenlemeSimgesiButton.isEnabled());

            bekle(2);
            driver.quit();
        }

        @Test
        public void DiaryAddExercisesButton(){
            driver.get("https://power-pulse-qa.f.goit.study/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
            signInButton.click();

            WebElement emailInput = driver.findElement(By.xpath("//input"));
            emailInput.sendKeys("testpowerpulse@gmail.com", Keys.TAB);

            WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
            passwordInput.sendKeys("123456Aa");

            WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
            signInButton2.click();

            WebElement addExercisesButton = driver.findElement(By.xpath("(//a[@class='ButtonAddItem_addButtonLink__6S3vs'])[2]"));
            Assert.assertTrue("Diary Add Exercises butonu aktif değil", addExercisesButton.isDisplayed() && addExercisesButton.isEnabled());

            bekle(2);
            driver.quit();
        }

        @Test
        public void DiaryAddProductButton(){
            driver.get("https://power-pulse-qa.f.goit.study/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
            signInButton.click();

            WebElement emailInput = driver.findElement(By.xpath("//input"));
            emailInput.sendKeys("testpowerpulse@gmail.com", Keys.TAB);

            WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
            passwordInput.sendKeys("123456Aa");

            WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
            signInButton2.click();

            WebElement addProductButton = driver.findElement(By.xpath("(//a[@class='ButtonAddItem_addButtonLink__6S3vs'])[1]"));
            Assert.assertTrue("Diary Add Product butonu aktif değil", addProductButton.isDisplayed() && addProductButton.isEnabled());

            bekle(2);
            driver.quit();
        }

        @Test
        public void exercisesBodyPartsButton() {
            driver.get("https://power-pulse-qa.f.goit.study/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
            signInButton.click();

            WebElement emailInput = driver.findElement(By.xpath("//input"));
            emailInput.sendKeys("testpowerpulse@gmail.com", Keys.TAB);

            WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
            passwordInput.sendKeys("123456Aa");

            WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
            signInButton2.click();

            WebElement exercisesButton = driver.findElement(By.xpath("(//a[@class='UserNav_link__9pIje '])[2]"));
            exercisesButton.click();

            WebElement bodyPartsButton = driver.findElement(By.xpath("//li[@class='ExercisesFilter_active__ETb-K ExercisesFilter_sliderLi__65RO1']"));
            Assert.assertTrue("Exercises Body Parts butonu aktif değil", bodyPartsButton.isDisplayed() && bodyPartsButton.isEnabled());

            bekle(2);
            driver.quit();
        }

        @Test
        public void exercisesEquipmentButton(){
            driver.get("https://power-pulse-qa.f.goit.study/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
            signInButton.click();

            WebElement emailInput = driver.findElement(By.xpath("//input"));
            emailInput.sendKeys("testpowerpulse@gmail.com", Keys.TAB);

            WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
            passwordInput.sendKeys("123456Aa");

            WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
            signInButton2.click();

            WebElement exercisesButton = driver.findElement(By.xpath("(//a[@class='UserNav_link__9pIje '])[2]"));
            exercisesButton.click();

            WebElement equipmentButton = driver.findElement(By.xpath("(//li[@class=' ExercisesFilter_sliderLi__65RO1'])[1]"));
            Assert.assertTrue("Exercises Equipment butonu aktif değil", equipmentButton.isDisplayed() && equipmentButton.isEnabled());

            bekle(2);
            driver.quit();
        }

        @Test
        public void exercisesMusclesButton(){
            driver.get("https://power-pulse-qa.f.goit.study/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
            signInButton.click();

            WebElement emailInput = driver.findElement(By.xpath("//input"));
            emailInput.sendKeys("testpowerpulse@gmail.com", Keys.TAB);

            WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
            passwordInput.sendKeys("123456Aa");

            WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
            signInButton2.click();

            WebElement exercisesButton = driver.findElement(By.xpath("(//a[@class='UserNav_link__9pIje '])[2]"));
            exercisesButton.click();

            WebElement musclesButton = driver.findElement(By.xpath("(//li[@class=' ExercisesFilter_sliderLi__65RO1'])[2]"));
            Assert.assertTrue("Exercises Muscles butonu aktif değil", musclesButton.isDisplayed() && musclesButton.isEnabled());

            bekle(2);
            driver.quit();
        }

        @Test
        public void logoAnaSayfadaGörünür(){
            driver.get("https://power-pulse-qa.f.goit.study/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
            signInButton.click();

            WebElement emailInput = driver.findElement(By.xpath("//input"));
            emailInput.sendKeys("testpowerpulse@gmail.com",Keys.TAB);

            WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
            passwordInput.sendKeys("123456Aa");

            WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
            signInButton2.click();

            WebElement logo = driver.findElement(By.xpath("//div[@class='heartbeat-element']"));
            Assert.assertTrue("Logo ana sayfada görünüyor değil", logo.isDisplayed());

            bekle(2);
            driver.quit();
        }

        @Test
        public void appNameAnaSayfadaGörünür(){
            driver.get("https://power-pulse-qa.f.goit.study/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@class='WelcomPage_linkSignIn__dpaLe']"));
            signInButton.click();

            WebElement emailInput = driver.findElement(By.xpath("//input"));
            emailInput.sendKeys("testpowerpulse@gmail.com",Keys.TAB);

            WebElement passwordInput = driver.findElement(By.xpath("(//input)[2]"));
            passwordInput.sendKeys("123456Aa");

            WebElement signInButton2 = driver.findElement(By.xpath("//button[@class='Button_button__wiIYs ']"));
            signInButton2.click();

            WebElement appName = driver.findElement(By.xpath("(//div)[4]"));
            Assert.assertTrue("App Name ana sayfada görünmüyor", appName.isDisplayed());

            bekle(2);
            driver.quit();
        }




}




