package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTables_row {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
        Thread.sleep(2000);
        System.out.println();

        WebElement Header=driver.findElement(By.xpath("//table[@id='task-table']/thead/tr"));
        System.out.println(Header.getText());

       List<WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
//
        //in progress
        for(WebElement row:rows){
            System.out.println(row.getText());
            System.out.println();
        }

        Thread.sleep(2000);
        List<WebElement> column = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int count=1;
        for(WebElement col:column){

            if(col.getText().equals("in progress")){
//           print the row number
                System.out.println(count);
                WebElement rowStatus = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + count + "]"));
                System.out.println(rowStatus.getText());
            }
            count=count+1;
        }


    }
}
