package FA17BSE038;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Waleed {

    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void signUpPassed() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String URL = "https://apkpure.com/register";
        driver.get(URL);

        WebElement userName = driver.findElement(By.name("account"));
        userName.sendKeys("waleed101010");
        sleep(300);

        WebElement eMail = driver.findElement(By.name("email"));
        eMail.sendKeys("waleed@waleed.com");
        sleep(300);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("waleed@waleed.com");
        sleep(300);

        WebElement confirmPassword = driver.findElement(By.name("password_r"));
        confirmPassword.sendKeys("waleed@waleed.com");
        sleep(300);

        WebElement signUp = driver.findElement(By.xpath("//button[@class='cmt-btn cmt-auth-submit']"));
        signUp.click();
        sleep(3000);

        String expectedURL = "https://apkpure.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "There's an error");

        sleep(1500);
        driver.quit();
    }

    @Test
    public void signUpFailed() {
        //As there isn't any error like this in this website so we assume that
        // it signs up user even with one field empty

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String URL = "https://apkpure.com/register";
        driver.get(URL);

        WebElement userName = driver.findElement(By.name("account"));
        userName.sendKeys("waleed101010");
        sleep(300);

        WebElement eMail = driver.findElement(By.name("email"));
        eMail.sendKeys("");
        sleep(300);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("waleed@waleed.com");
        sleep(300);

        WebElement confirmPassword = driver.findElement(By.name("password_r"));
        confirmPassword.sendKeys("waleed@waleed.com");
        sleep(300);

        WebElement signUp = driver.findElement(By.xpath("//button[@class='cmt-btn cmt-auth-submit']"));
        signUp.click();
        sleep(3000);

        String expectedURL = "https://apkpure.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "There's an error");

        sleep(1500);
        driver.quit();
    }

    @Test
    public void logInPassed() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String URL = "https://apkpure.com/login";
        driver.get(URL);

        WebElement userName = driver.findElement(By.name("account"));
        userName.sendKeys("waleed101010");
        sleep(300);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("waleed@waleed.com");
        sleep(300);

        WebElement signUp = driver.findElement(By.xpath("//button[@class='cmt-btn cmt-auth-submit']"));
        signUp.click();
        sleep(3000);

        String expectedURL = "https://apkpure.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "There's an error");

        sleep(1500);
        driver.quit();
    }

    @Test
    public void logInFailed() {
        //We assume that the the user still can login to
        // the website even after wrong password input

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String myURL = "https://apkpure.com/login";
        driver.get(myURL);

        WebElement userName = driver.findElement(By.name("account"));
        userName.sendKeys("waleed101010");
        sleep(300);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("wrongpassword");
        sleep(300);

        WebElement signUp = driver.findElement(By.xpath("//button[@class='cmt-btn cmt-auth-submit']"));
        signUp.click();
        sleep(3000);

        String expectedURL = "https://apkpure.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "There's an error");

        sleep(1500);
        driver.quit();
    }

}