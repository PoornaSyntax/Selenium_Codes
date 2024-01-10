package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesHW {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        WebElement enableCheckbox = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableCheckbox.click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));

          for(WebElement checkBox:checkBoxes){
                 String check = checkBox.getAttribute("value");
                 if(check.equals("Checkbox-1") || check.equals("Checkbox-4")){
                     checkBox.click();
                 }
           }

    }
}
