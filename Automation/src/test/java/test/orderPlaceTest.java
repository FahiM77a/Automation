package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orderPlaceTest extends orderPlacePage{

    @Test
    public void orderPlace(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(menuItem));
        Actions actions = new Actions(driver);
        actions.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(menuItem))).perform();

        driver.findElement(subOption).click();
        driver.findElement(phone).click();

        WebElement cartQnty = driver.findElement(By.id("product_enteredQuantity_20"));
        cartQnty.clear();
        cartQnty.sendKeys(newQuantity);

        driver.findElement(By.id("add-to-cart-button-20")).click();
        driver.findElement(By.className("cart-label")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.className("checkout-as-guest-button")).click();

        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys(f_name);
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys(l_name);
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys(email);
        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys(company);
        driver.findElement(country).click();

        driver.findElement(By.id("BillingNewAddress_City")).sendKeys(cityName);
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys(address);
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys(zipCode);
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys(phoneNo);
        driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys(faxNo);

        driver.findElement(By.className("new-address-next-step-button")).click();
        driver.findElement(shipping_option).click();
        driver.findElement(By.className("shipping-method-next-step-button")).click();
        driver.findElement(By.id("paymentmethod_1")).click();

        driver.findElement(By.className("payment-method-next-step-button")).click();
        driver.findElement(paymentOption).click();

        driver.findElement(By.id("CardholderName")).sendKeys(cardHolderName);
        driver.findElement(By.id("CardNumber")).sendKeys(cardNumber);

        driver.findElement(expiredDate).click();
        driver.findElement(expiredYear).click();

        driver.findElement(By.id("CardCode")).sendKeys(cardCode);
        driver.findElement(By.className("payment-info-next-step-button")).click();
        driver.findElement(By.className("confirm-order-next-step-button")).click();

        WebElement orderConfirmationMsg = driver.findElement(ConfirmationMsg);
        Assert.assertTrue(orderConfirmationMsg.isDisplayed(),
                "Order confirmation message is not displayed");
        Assert.assertEquals(orderConfirmationMsg.getText(),expectedMessage,
                "Correct order confirmation message is not displayed");

    }
}
