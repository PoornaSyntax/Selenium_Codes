package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//       maximnize
        driver.manage().window().maximize();
//        goto fb.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();

        driver.findElement(By.xpath("//b[text()='Admin']")).click();
        Thread.sleep(2000);
        WebElement dd = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
        Select sel = new Select(dd);
        sel.selectByIndex(2);

    }
}
