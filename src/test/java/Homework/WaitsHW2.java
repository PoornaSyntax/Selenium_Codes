package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsHW2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();


//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//       declaration
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));


        driver.findElement(By.xpath("//button[@id='display_button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enabled']"))).click();

        driver.findElement((By.xpath("//button[@id='enable_button']"))).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));

        WebElement ele = driver.findElement(By.xpath("//button[text()='Enabled']"));
        System.out.println(ele.getText());
        driver.findElement((By.xpath("//button[@id='enable_button']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));


    }
}
