package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsHW {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement enableRadioButton=driver.findElement(By.xpath("//button[@id='enabledradio']"));
        enableRadioButton.click();

        WebElement enableRadioMale = driver.findElement(By.xpath("//input[@value='gender-male']"));

        if(enableRadioButton.isEnabled()){
            enableRadioMale.click();
            System.out.println("Male radio button is enabled and has been clicked");
        }else{
            System.out.println("radio button is not enabled");
        }
    }
}
