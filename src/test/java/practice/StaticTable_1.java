package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
        List <WebElement>rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        for(WebElement row:rows){
            System.out.println(row.getText());
        }
        System.out.println();
        int count =1;
        List<WebElement>column = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        for(WebElement col:column){
            if(col.getText().equals("in progress")){
                System.out.println(driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]")).getText());
            }
            count = count+1;
        }

    }
}
