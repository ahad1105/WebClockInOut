import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;


public class Runner {


    WebDriver driver = new ChromeDriver();



    @BeforeTest
    void Before() throws InterruptedException {



        driver.get("https://login-exsr-saasfaprod1.fa.ocs.oraclecloud.com/oam/server/obrareq.cgi?encquery%3DiWA1axXKrNxaQB6F%2FEJtBNNQ4bZc6LSWVW98m%2B7fh4zPtzlT63LHD6Nos2aat0nRHEZV4uasOOD3jXx9RVJ%2BBEPwTGGsITCvD9o%2F9JPpkB7zQC5RULTIa1tXyD2F%2FyXOywDP%2Bun6iZ14sZqpy7mVttg3OufaE0%2B04NhTUnSwJ4xD9BmmgieUfgEhJYC%2BA9i8EYwCcN%2FKPd%2FyZeMf%2B76jFItbdergnrWHIUmpAZP8rHpGe%2Bb8dEWrAgydGeHlBFOPGeuJeOaNtVRO%2BzmMG0WJHMzFVF%2FuuutcbQPAx10a51GVXlBebWZtGmjaPiwrDbJE%2Bx4HPImxUYf51%2F1WGF2H2i4A2U5ls0ZIU3SEwK7UDxcS2jWNeisNe7lkKDaDWOFJKq1ARDZdTfOj2swOj09yFRn835zlIZHKSzM%2F0xXVfd1GgjnS58LBODGjBxtYt9EQ8jsLyZ6Hg7neDz8d7LnDCV9IrMLBSlIKxDUgRlI9Erm%2FENvbrvrDLsghcM4pgVBj4GzFUn2AkA9LAw5nwfIreep%2FoQ6JtRqVrdZ4vn2OuZywgf7u%2Bh9PwKGXc%2BFYOyw%2B4ayl%2F55Qlp%2BmeoaZqHMr%2FdI9aCluOF3LePwy2X6OS1P2rcl1X6JVitmTuSBKJanhDPMWDtLFd1bJqwnpWKaD2vsZAL08mb0TYx71FTDck%2FyJuw66SdyuQQanOjwiM223GJlMB%2FkvnOUO5OOOk1d%2Bn6EoQ5jkY7%2FOZc81qR6UArd%2B6i%2FJvVAnKPEwllju2KL2m5osjmk%2BqTU70loc8Y1BYZ6MlwbhC%2FQKViB6r01JtG8cejY4xozgSbtDDRIt8xz3iAu5mSEYmjmfI%2FaxxO7SIG%2F2SB5RpsiMOSh32xf25tUqXhJ%2BHEirZJ%2FaPOfOGGGM6%2B0kr7FQoSEtVD1iCa4vyD5zYGj%2Bp1tlDqJjXgwDGjH0JUCZkduQ1wHaZe27R4VQQBwcn7P0nr4QQgunYtPTuIs%2BBj8N6oHqldwdJpcaVOvDko0kFxOjUjMQJt7KdKvYpS1tMemdbXXbsu8L1JQpIohO%2F1kMQawS2oe65%2Fo0uY7jr2Jb7jSv0TpzZ3eqQSDgOKqt4h6C3Fp0a7t9cWKetTceoRAFWgVOWNv522JKswQOXCwukg%2BX1WrBe41fNW0%2BteLaPtWOykYeirohYPZQIpo2PMiITQNtI0sZgHXbFVQFIDfVeme8b3l2mKfZXea2DMvrYZNQ7LO1tjRscElyi24l8XxRQo98zoo3GUCRLEjnew6G2n2dxh9Ms%2BPWlZwSCZob9rWinaLcXmeLwZz5hGAGEzWAxhmdVSL9KUP8yRGMqsHgCLmvAP85GVG3BgwaRzU3J1B9RCEWnuf9QcsSWNsKvHvmxNoHCkwKHack%2FUu1vgVgQaqg7mKC0yDA18qObyuWICJefQOb5RKLYjLhiCN8ZO3S6UjnQ%2FdEhdjwA%2F9uC4Uf2ps4jzD88zBfnrSd4Qmuc647F%2Bs8nHjnWoDLNqq5gOLf6S9BukZC93NOdmyLK%2BCfI8Qiu5AeHpBIW8FUuEuIqdMWmmsyxTtqcEy2G%2F3lKWNaAu8NbwDZ%2BlTOl%2FdmMrgCYnNFeY5aYmyv6Z4CWqFSGQ6r3ehUanzMZzpGN%2BRJy6oirz06jcY1WEIQnHgccQdDf%2FwEYml7QfJvJwxyUdzN8zm%2FYhxefUz%2BxaQnLg%3D%3D%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2%26cksum%3D1211d1f289bee4eb5710025a0deb4c1de79d6a7b&ECID-Context=1.0067z5vsv_q03zV6y3V%5E6G00CP_H0000I5%3BkXjE");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        driver.findElement(By.name("userid")).sendKeys("23192");

        driver.findElement(By.name("password")).sendKeys("System@1234");

        driver.findElement(By.id("btnActive")).click();

        driver.findElement(By.id("HWM_HCMWFMWORKAREA_FUSE_WEBCLOCK")).click();



        //driver.findElement(By.xpath("//div[@title='Punch Out']")).click();



    }

    @AfterTest
    void After()
    {
        driver.quit();
    }



}