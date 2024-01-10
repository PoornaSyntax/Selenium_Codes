package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands1 {
    public static void main(String[] args) {


    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://syntaxprojects.com/selenium_commands_selector.php");
    //send keys after clearing the textbox
        WebElement textBox = driver.findElement(By.xpath("//input[@id='textInput']"));
    //clear the text from the element
        textBox.clear();
    //send keys
    textBox.sendKeys(("welcome"));
    //check if the option 1 is selected
    //if no then select it
        WebElement option1 = driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option1']"));
        boolean stateofOp1 = option1.isSelected();
        if(!stateofOp1){
            option1.click();
        }
        System.out.println("The state of the radiobutton is "+ option1.isSelected());
        //to check if the option2 is enabled or not enabled
        WebElement option2 = driver.findElement(By.xpath("//input[@value='option2']"));
        boolean enableStateofOp2 = option2.isEnabled();
        if(enableStateofOp2){
            System.out.println("Option  is enabled and can be selected");
        }else{
            System.out.println("option2 is not enabled and  not clickable");
        }
        //check if the option3 is displayed or not
        //and print the status on the console
        WebElement option3 = driver.findElement(By.xpath("//input[@value='option3']"));
        boolean isDisplayedOp3 = option3.isDisplayed();
        if(isDisplayedOp3){
            System.out.println("the radiobutton option3 is displayed");
        }else{
            System.out.println("the radio button option3 is not displayed");
        }

        WebElement textMsg = driver.findElement(By.xpath( "//div[@id='textElement']"));
        String text=textMsg.getText();
        System.out.println(text);


                ;
    }}
