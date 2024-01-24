package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicTableHW {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
     // goto hrms
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     //login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

     //click on PIm option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        //        get the column with the ids
        List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        int count =1;
        for( WebElement Ele:ids){
           if(Ele.getText().equals("95848A")) {
                WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + count + "]/td[1]"));
                checkbox.click();
                break;
            }
            count = count+1;
        }

        }

    }

