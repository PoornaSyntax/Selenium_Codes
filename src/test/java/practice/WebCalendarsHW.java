package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebCalendarsHW {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        goto hrms
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");
        WebElement calander = driver.findElement(By.xpath("//input[@id=\"start_date\"]"));
        calander.click();

        boolean notFound = true;
        while(notFound){
            String currentMonth = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]")).getText();
            if(currentMonth.equals("August 2024")){
                notFound=false;
                //you can have the logic to click on date here also

                }
            if(notFound){
                WebElement next = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));
                next.click();
            }
        }
        int count = 0;
        //select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
        for(WebElement date:allDates){
            if(date.getText().equals("29")){
                count = count+1;
            }
            if(count==2){
                date.click();
                break;
            }
        }


    }
}
