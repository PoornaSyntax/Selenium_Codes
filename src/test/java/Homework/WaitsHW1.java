package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WaitsHW1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']")).click();
        WebElement btnMale = driver.findElement(By.xpath("//input[@value='Male' ]"));
        btnMale.click();
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']")).click();
        WebElement checkBoxOption1 = driver.findElement(By.xpath("//input[@value='Option-1']"));
        checkBoxOption1.click();
    }
}
