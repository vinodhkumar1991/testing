package myfirstseleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class GmailLogin
{
   public static void main(String[] args)
   {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinum\\Desktop\\new chrome driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      //implicit wait
     // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("https://accounts.google.com/signin");
      //identify email
      WebElement l = driver
      .findElement(By.name("identifier"));
      l.sendKeys("vinuml406@gmail.com");
      WebElement b = driver
    	      .findElement(By.className("VfPpkd-LgbsSe"));
    	      b.click();
      //identify password
      WebElement p = driver
      .findElement(By.name("password"));
      p.sendKeys("vinodh@123V");
      b.click();
      //close browser
      driver.close();
   }
}
