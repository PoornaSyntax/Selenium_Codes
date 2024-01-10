package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("https://www.google.com");
        //driver.manage().window().fullscreen();

        String title = driver.getTitle();
        System.out.println("the title of hte page is "+title);

        String url =driver.getCurrentUrl();
        System.out.println("the url is "+url);
        //slow down code
        Thread.sleep(2000);

        //close the window
        driver.quit();


    }
}
