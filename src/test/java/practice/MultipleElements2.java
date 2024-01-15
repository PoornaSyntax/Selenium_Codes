package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for(WebElement link:allLinks){
            String text =link.getText();
            System.out.println(text);
            //There are lot of empty spaces means that there
            //are some "a" tags which has no text in them

            String linkAddress = link.getAttribute("href");
            System.out.println(linkAddress);
        }
    }
}
