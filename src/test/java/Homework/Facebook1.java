package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
         WebElement newAccount = driver.findElement(By.partialLinkText("new account"));
         newAccount.click();
         Thread.sleep(2000);
         WebElement fName = driver.findElement(By.name("firstname"));
                 fName.sendKeys("John");
        WebElement lName = driver.findElement(By.name("lastname"));
                lName.sendKeys("Smith");
        WebElement mobile_Email = driver.findElement(By.name("reg_email__"));
        mobile_Email.sendKeys("303-456-7890");
        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("Abc$1234");
        //driver.close();

    }
}
