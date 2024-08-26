import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class ClockTest extends Runner {

    @Test
    void punchINOUT() throws InterruptedException {
        driver.findElement(By.id("HWM_HCMWFMWORKAREA_FUSE_WEBCLOCK")).click();

        driver.findElement(By.xpath("//div[@title='Punch In']")).click();

        WebElement testDropDown = driver.findElement(By.xpath("//input[@class='x1s6']"));
        testDropDown.clear();
        testDropDown.sendKeys("Client Location");
        driver.findElement(By.xpath("//button[@class='xux p_AFTextOnly']")).click();

        Thread.sleep(10000);

    }
}