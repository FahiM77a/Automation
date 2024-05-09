package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.UUID;

public abstract class BaseTest {
    protected final int MAX_WAIT = 10;
    protected final String URL = "https://demo.nopcommerce.com/";
    protected final String domain = "example.com";
    protected final String uniqueID = UUID.randomUUID().toString();
    protected final String email = "user_"+ uniqueID + "@" + domain;
    protected final String password = "pass@1234";
    protected final String company = "Brainstation-23";
    protected final String f_name = "Md.Fahim";
    protected final String l_name = "Ahmad";
    protected final String companyName = "Brainstation-23";
    protected final String cityName = "Dhaka";
    protected final String address = "11/E/B, BUET Staff Quarter, Dhaka-1000";
    protected final String zipCode = "1000";
    protected final String phoneNo = "01957512165";
    protected final String faxNo = "+33123456789";
    protected final By country = By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]/option[20]");
    protected WebDriver driver;
    protected WebDriverWait wait;



    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_WAIT));
        driver.get(URL);
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
