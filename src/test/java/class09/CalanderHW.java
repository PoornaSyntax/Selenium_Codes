package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CalanderHW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get(" http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
        driver.findElement(By.xpath("//input[@id='calFromDate']")).click();

          WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
          Select selMonth=new Select(month);
          selMonth.selectByVisibleText("Jul");



          WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
          Select selYear=new Select(year);
          selYear.selectByValue("1968");

          List<WebElement> calendar=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
          for(WebElement cal:calendar){
              if(cal.getText().equals("6")){
                  cal.click();
              }
          }
    }
}
