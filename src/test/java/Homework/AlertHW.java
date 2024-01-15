package Homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        //find the alert1
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert1.click();
        Thread.sleep(5000);

        Alert alertHandler=driver.switchTo().alert();
        System.out.println(alertHandler.getText());
        alertHandler.sendKeys("Welcome ");
        Thread.sleep(5000);
        alertHandler.accept();

    }
}
