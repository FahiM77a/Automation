package test;

import org.openqa.selenium.By;

public class orderPlacePage extends BaseTest{
    protected final String newQuantity = "2";
    protected final String cardHolderName = "Md. Fahim Ahmad";
    protected final String cardNumber = "374245455400126";
    protected final String cardCode = "837";
    protected final String expectedMessage = "Your order has been successfully processed!";
    protected final By menuItem = By.xpath("//*[@class='top-menu notmobile']/li[2]/a");
    protected final By subOption = By.xpath("//*[@class=\"top-menu notmobile\"]/li[2]/ul/li[2]/a");
    protected final By phone = By.xpath("//*[contains(@class,\"item-grid\")]/div[3]//a");
    protected final By shipping_option = By.xpath("//*[@id=\"shippingoption_1\"]");
    protected final By paymentOption = By.xpath("//*[@id=\"CreditCardType\"]/option[1]");
    protected final By expiredDate = By.xpath("//*[@id=\"ExpireMonth\"]/option[7]");
    protected final By expiredYear = By.xpath("//*[@id=\"ExpireYear\"]/option[4]");
    protected final By ConfirmationMsg = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div/div[1]/strong");

}
