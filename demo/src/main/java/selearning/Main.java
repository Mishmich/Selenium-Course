package selearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        // Invoking Browser
        
        // Chrome - ChromeDriver exten->Methods close get
        
        // Firefox- FirefoxDriver ->methods close get
        
        // WebDriver  close  get
        
        // WebDriver methods + class methods
        
        // Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver-win64/chromedriver.exe/");
        
        WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://rahulshettyacademy.com");
        
        System.out.println(driver.getTitle());
        
        System.out.println(driver.getCurrentUrl());
        
        //driver.close(); - current window
        //driver.quit(); - all windows
    }
}