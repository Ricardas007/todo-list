package lt.techin.to_do_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDoPageTest {
    WebDriver driver;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
    }

    @Test
    void addWordPass() throws InterruptedException {
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Add new todo']")).sendKeys("Niekas", Keys.RETURN);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("ul li:last-child")).getText();
//        Nepabaigtas
//        Assertions.assertEquals(driver.findElement(By.cssSelector("ul li:last-child")));
//        driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));

//        driver.findElement(By.xpath("//i[@id='plus-icon']")).click();
    }
}
