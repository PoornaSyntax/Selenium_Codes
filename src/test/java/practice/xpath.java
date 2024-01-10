package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();


        driver.manage().window().fullscreen();
        //Thread.sleep(9000);
        //go to syntax projects.com
        driver.get("https://syntaxprojects.com/Xpath.php");
        Thread.sleep(20000);
        //finding the input box username
        WebElement userName= driver.findElement(By.xpath("//input[@id='title']"));;
        //finding the button
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();
        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'][2]"));
        email2.sendKeys("abc@gmail.com");
    }
}
