package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
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
        //find the security question
        WebElement q1=driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        q1.sendKeys("what is your name");
        //find the text and print on the console
        WebElement textMsg = driver.findElement(By.xpath("//label[contains(text(),' Lorem ipsum')]"));
        String text = textMsg.getText();
        System.out.println(text);
        //send the api settings
        WebElement apiSettings=driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("123.145.567");
        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("abc@gmail.com");
        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("abcdef");


}}