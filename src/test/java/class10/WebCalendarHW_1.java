package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebCalendarHW_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");

        WebElement calander = driver.findElement(By.xpath("//input[@placeholder='Start date']"));
        calander.click();
        // select from calander
        boolean notFound=true;
        while(notFound) {
            String currentMonth = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]")).getText();
            if (currentMonth.equals("August 2024")) {
                notFound = false;
            }
            if (notFound) {
//            click on next button
                WebElement next = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));
                next.click();
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
        int currentDateCount=0;
        for(WebElement date:allDates){
            if(date.getText().equals("31")){
                currentDateCount++;
            }
            if(currentDateCount==2){
                date.click();
                break;

            }
        }
    }
}
