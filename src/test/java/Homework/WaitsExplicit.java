package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsExplicit {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));

        //click to display button

        driver.findElement(By.xpath("//button[@id='display_button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enabled']"))).click();
        //click to enable button
        driver.findElement((By.xpath("//button[@id='enable_button']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']"))).click();
        // click to check the checkbox
        driver.findElement(By.xpath("//button[@id='checkbox_button']")).click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        if(checkBox.isSelected()){
            System.out.println("The checkbox is Selected");
        }else{
            System.out.println("The checkbox is not Selected");
        }



    }
}
