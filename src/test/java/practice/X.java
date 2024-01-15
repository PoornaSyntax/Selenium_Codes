package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");
        WebElement apiSettings = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));

        apiSettings.sendKeys("123.456.567");
        driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("123.145.567");

//        WebElement api = driver.findElement(By.cssSelector("input[name*='apiSettings']"));
//        api.clear();
//        api.sendKeys("567.178.789");
        //send the email 2
        WebElement email = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email.sendKeys("abc.gmail.com");
        //send the field 2
        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("abcdef");
   }
}
