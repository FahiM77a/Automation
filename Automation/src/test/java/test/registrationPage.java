package test;

import org.openqa.selenium.By;

import java.util.UUID;

public class registrationPage extends BaseTest{
    protected final By date = By.xpath("//*[@name=\"DateOfBirthDay\"]/option[6]");
    protected final By month = By.xpath("//*[@name=\"DateOfBirthMonth\"]/option[3]");
    protected final By year = By.xpath("//*[@name=\"DateOfBirthYear\"]/option[86]");


}
