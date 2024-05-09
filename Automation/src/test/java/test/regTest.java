package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class regTest extends registrationPage{

    @Test
    public void registrationTest(){
        driver.findElement(By.className("ico-register")).click();

        driver.findElement(By.id("gender-male")).click();

        driver.findElement(By.id("FirstName")).sendKeys(f_name);
        driver.findElement(By.id("LastName")).sendKeys(l_name);

        driver.findElement(date).click();
        driver.findElement(month).click();
        driver.findElement(year).click();

        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Company")).sendKeys(companyName);
        driver.findElement(By.id("Newsletter")).click();

        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
        driver.findElement(By.id("register-button")).click();

        WebElement regConfirmMsg = driver.findElement(By.className("result"));

        Assert.assertTrue(regConfirmMsg.isDisplayed(),"Registration confirm msg is not displayed");

        Assert.assertEquals(regConfirmMsg.getText(),"Your registration completed",
                "Registration is not completed");
    }
}
