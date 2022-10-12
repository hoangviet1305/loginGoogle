import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class test {
    WebDriver driver;

    @BeforeTest
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S202233785%3A1665548732305754&authuser=0&continue=https%3A%2F%2Fmyaccount.google.com%2F&ec=GAlAwAE&hl=vi&service=accountsettings&flowName=GlifWebSignIn&flowEntry=AddSession");

    }
    @Test
    public void run(){
        driver.findElement(By.id("identifierId")).sendKeys("micro7.viet@gmail.com");
        sleep(1500);
//
//      //
        driver.findElement(By.xpath("//span[contains(text(),'Tiếp theo')]")).click();
        sleep(2000);
//      //
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Viet13052000");
        sleep(1500);
        //
        driver.findElement(By.xpath("//span[contains(text(),'Tiếp theo')]")).click();
        sleep(500);
    }
    @AfterTest
    public void end(){
        System.out.println("finish");
        sleep(10000);
        driver.quit();
    }

    private void sleep(int time){
        try{
            Thread.sleep(time);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
