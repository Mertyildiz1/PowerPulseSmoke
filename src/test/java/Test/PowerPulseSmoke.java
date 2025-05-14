package Test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class PowerPulseSmoke extends TestBase {


    @Test
    public void Smoke() throws InterruptedException {
        // Navigate to url "https://power-pulse-qa.f.goit.study/"
        String url = "https://power-pulse-qa.f.goit.study/";
        driver.get(url);
        // Verify that home page is visible successfully
        WebElement homeText = driver.findElement(By.xpath("//h1"));
        Assert.assertTrue(homeText.isDisplayed());

        // Verify the title is "Power Pulse"
        String expectedtTitle = "Power Pulse";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedtTitle,actualTitle);

        // Click "Sign In" Button
        WebElement signInButton = driver.findElement(By.xpath("//*[.=' Sign In']"));
        signInButton.click();

        // Enter email and password
        WebElement emailInput = driver.findElement(By.xpath("(//input[@class='FormField_field__SGWnB'])[1]"));
        emailInput.sendKeys("nafawah933@dmener.com");
        WebElement passwordInput = driver.findElement(By.xpath("(//input[@class='FormField_field__SGWnB'])[2]"));
        passwordInput.sendKeys("test123456Aa");

        // After entering email and password, click on "Sign In" button
        WebElement signInConfirmButton = driver.findElement(By.xpath("//*[contains(@class, 'Button_button__wiIYs')]"));
        signInConfirmButton.click();

        // Verify that "Diary" button is enable and visible
        WebElement diaryButton = driver.findElement(By.xpath("//a[.='Diary']"));
        Assert.assertTrue(diaryButton.isDisplayed());
        Assert.assertTrue(diaryButton.isEnabled());

        // Verify that "Products" button is enable and visible
        WebElement productsButton = driver.findElement(By.xpath("//a[.='Products']"));
        Assert.assertTrue(productsButton.isDisplayed());
        Assert.assertTrue(productsButton.isEnabled());

        // Verify that "Exercises" button is enable and visible
        WebElement exercisesButton = driver.findElement(By.xpath("//a[.='Exercises']"));
        Assert.assertTrue(exercisesButton.isDisplayed());
        Assert.assertTrue(exercisesButton.isEnabled());

        // Verify that Setting Icon button is enable and visible
        WebElement settingsIcon = driver.findElement(By.xpath("//*[contains(@class, 'UserBar_iconSettings__Otmcf')]"));
        Assert.assertTrue(settingsIcon.isDisplayed());
        Assert.assertTrue(settingsIcon.isEnabled());

        // Verify that "Add Products" button is enable and visible
        WebElement addProductButton = driver.findElement(By.xpath("(//*[contains(@class, 'ButtonAddItem_addButtonLink__6S3vs')])[1]"));
        Assert.assertTrue(addProductButton.isDisplayed());
        Assert.assertTrue(addProductButton.isEnabled());

        // Verify that "Add Exercises" button is enable and visible
        WebElement addExercisesButton = driver.findElement(By.xpath("(//*[contains(@class, 'ButtonAddItem_addButtonLink__6S3vs')])[2]"));
        Assert.assertTrue(addExercisesButton.isDisplayed());
        Assert.assertTrue(addExercisesButton.isEnabled());

        // Verify that the "Body Parts" "Equipment" and "Muscles" buttons in the Exercises tab are enable and visible
        exercisesButton.click();
        List<WebElement> bodyEquipmentMusclesButtons = driver.findElements(By.cssSelector(".ExercisesFilter_sliderLi__65RO1"));
        for (int i = 0; i < bodyEquipmentMusclesButtons.size() ; i++) {
            Assert.assertTrue(bodyEquipmentMusclesButtons.get(i).isEnabled());
            Assert.assertTrue(bodyEquipmentMusclesButtons.get(i).isDisplayed());
        }

        // Verify that the options in the "Body Parts" tab are visible and enable
        List<WebElement> bodyPartsOptions = driver.findElements(By.xpath("//div[@class='ExercisesSubcategoriesItem_exerciseItemWrap__+WjCw']"));
        for (int i = 0; i < bodyPartsOptions.size() ; i++) {
            Assert.assertTrue(bodyPartsOptions.get(i).isDisplayed());
            Assert.assertTrue(bodyPartsOptions.get(i).isEnabled());
        }

        // Verify that the "Categories" and "All" buttons in the Products tab are enable and visible
        productsButton.click();
        List<WebElement> categoriesAllButtons = driver.findElements(By.xpath("//select"));
        for (int i = 0; i < categoriesAllButtons.size() ; i++) {
            Assert.assertTrue(categoriesAllButtons.get(i).isEnabled());
            Assert.assertTrue(categoriesAllButtons.get(i).isDisplayed());
        }
        Thread.sleep(2000);

        // Select all categories from the categories menu and verify that the results are appropriate for the category.
        WebElement categori = driver.findElement(By.xpath("//*[@name='category']"));
        Thread.sleep(1000);
        categori.click();
        List<WebElement> categoriList = driver.findElements(By.xpath("//select[1]//option"));

        for (int i = 1; i < categoriList.size(); i++) {

            categoriList.get(i).click();
            Thread.sleep(1000);
            System.out.println(categoriList.get(i).getText());
            Thread.sleep(1000);
            WebElement tableCategoriName = driver.findElement(By.xpath("(//li[@class='ExercisesItem_productCategory__w+tQU']//span[@class='ExercisesItem_exerciseCardItem__hHkND'])[1]"));
            Assert.assertEquals(categoriList.get(i).getText(),tableCategoriName.getText());
        }


        // Verify that Search area button in the Products tab is enable and visible
        WebElement searchArea = driver.findElement(By.xpath("//input"));
        Assert.assertTrue(searchArea.isDisplayed());
        Assert.assertTrue(searchArea.isEnabled());

        // Verify that logo is enable and visible
        WebElement logo = driver.findElement(By.xpath("//div[@class='heartbeat-element']"));
        Assert.assertTrue(logo.isDisplayed());

        // Verify that website name is visible
        WebElement logoName = driver.findElement(By.cssSelector(".Logo_logo_name__1-4U8"));
        Assert.assertTrue(logo.isDisplayed());

        // Verify that Logout Icon is visible and enable
        WebElement logoutButton = driver.findElement(By.xpath("//*[@class='UserBar_svg_logout__8LWai']"));
        Assert.assertTrue(logoutButton.isDisplayed());
        Assert.assertTrue(logoutButton.isEnabled());

        // Click 'Logout' icon and verify that landed to home page successfully
        logoutButton.click();
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).isDisplayed());

    }
}
