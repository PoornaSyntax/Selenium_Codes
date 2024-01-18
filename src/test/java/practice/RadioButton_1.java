package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement radioBtnMale = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        radioBtnMale.click();
        //verify if it is selected
        if(radioBtnMale.isSelected()){
            System.out.println("Male radio button has been clicked");
        }else{
            System.out.println("male radio button has not been clicked");
        }
        //select the age
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for(WebElement radio:radioBtns){
            String option=radio.getAttribute(("value"));
            if(option.equals("15 - 50")){
                radio.click();
                break;
            }
        }
    }
}
