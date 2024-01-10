package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        WebElement followFavBook_1=driver.findElement(By.xpath("//input[@id='favourite-book']"));
        followFavBook_1.sendKeys("Lord of The Rings");

        WebElement followFavBook_2=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        followFavBook_2.sendKeys("The Magicians");
        WebElement followFavBook_3=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        followFavBook_3.sendKeys("The Golden compass");

        WebElement precedingBook_1=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        precedingBook_1.sendKeys("Pride and Prejudice");
        WebElement precedingBook_2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        precedingBook_2.sendKeys("Persuasion");
        WebElement precedingBook_3=driver.findElement(By.xpath("//input[@id='least-favorite']"));
        precedingBook_3.sendKeys("Sense and Sensibility");

        WebElement parentChild_1=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        parentChild_1.sendKeys("Mansfield Park");
        WebElement parentChild_2=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parentChild_2.sendKeys("Persuasion");
        WebElement parentChild_3=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        parentChild_3.sendKeys("Pride and Prejudice");
    }
}
