import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver_linux64.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\Selenium\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surface\\Downloads\\chromedriver_linux64.exe");
        // System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver_linux64.exe");
        // System.setProperty("webdriver.chromium.driver", "C:\\tools\\selenium\\chromiumdriver.exe");


        WebDriver driver = new ChromeDriver();


        driver.get("http://localhost:9000");
       // Thread.sleep(5000);
////
        WebElement inputElem1 = driver.findElement(By.id("number-input1"));

        inputElem1.sendKeys("1");
     //   Thread.sleep(5000);

        WebElement inputElem2 = driver.findElement(By.id("number-input2"));

        inputElem2.sendKeys("2");
       // Thread.sleep(5000);

        WebElement convertAdd = driver.findElement(By.id("convert-input"));
        convertAdd.click();
// Subtract
        WebElement inputElem3 = driver.findElement(By.id("number-input3"));

        inputElem3.sendKeys("3");
      //  Thread.sleep(5000);

        WebElement inputElem4 = driver.findElement(By.id("number-input4"));

        inputElem4.sendKeys("4");
     //   Thread.sleep(5000);

        WebElement convertSubtract = driver.findElement(By.id("convert-input1"));
        convertSubtract.click();

////Multiply
        WebElement inputElem5 = driver.findElement(By.id("number-input5"));

        inputElem5.sendKeys("5");
      //  Thread.sleep(5000);

        WebElement inputElem6 = driver.findElement(By.id("number-input6"));

        inputElem6.sendKeys("6");
      //  Thread.sleep(5000);

        WebElement convertMultiply = driver.findElement(By.id("convert-input2"));
        convertMultiply.click();

   ///Division

        WebElement inputElem7 = driver.findElement(By.id("number-input7"));

        inputElem7.sendKeys("7");
       // Thread.sleep(5000);

        WebElement inputElem8 = driver.findElement(By.id("number-input8"));

        inputElem8.sendKeys("7");
       // Thread.sleep(5000);

        WebElement convertDivide = driver.findElement(By.id("convert-input3"));
        convertDivide.click();







    }
}
