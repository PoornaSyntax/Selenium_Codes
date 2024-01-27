package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarHW {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");
        WebElement calClick = driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']"));
        calClick.click();

//        List<WebElement> days = driver.findElements(By.xpath("//table/tbody/tr/td"));
//        int Count = 0;
//        for (WebElement day : days) {
//            System.out.println(day.getText());
//            if (day.getText().equals("31")) {
//                Count = Count + 1;
//            }
//             if(Count==2){
//                 System.out.println(Count);
//                 System.out.println(day.getText());
//                 day.click();
//                  break;
//              }
//
//
//            }
        }
    }
