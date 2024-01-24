package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;

import java.io.IOException;
import java.util.List;

import static utils.CommonMethods.*;


public class SelectDate {
    public static void main(String[] args) throws IOException {
        openBrowserAndLaunchApplication();
        driver.findElement(By.id("txtUsername")).sendKeys(ConfigReader.read("userName"));

        driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.read("password"));

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

        driver.findElement(By.xpath("//input[@id='calFromDate']")).click();
        WebElement dropdownElementMonth = driver.findElement(By.className("ui-datepicker-month"));
        selectFromDropDown(dropdownElementMonth, "Jul");
        WebElement dropdownElementYear = driver.findElement(By.className("ui-datepicker-year"));
        selectFromDropDown(dropdownElementYear, "1968");
        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day:days){
            if(day.getText().equals("6")){
                day.click();
            }
        }
    }
}
