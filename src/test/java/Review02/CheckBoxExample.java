package Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxExample {
    public static void main(String[] args) {
        //https://syntaxprojects.com/basic-checkbox-demo.php
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableButton.click();

//        finding all the checkboxes
        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
//        iterate
        for(WebElement checkBox: allCheckboxes) {
            String option = checkBox.getAttribute("value");
            if (option.equals("Checkbox-1") || option.equals("Checkbox-4")) {
                checkBox.click();

            }

        }

}}
