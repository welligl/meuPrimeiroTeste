package Test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingTest {

    @Test
    public void testOpenWindow() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\opet\\Downloads\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get("https://globoesporte.globo.com/");

        navegador.quit();

        Assert.assertEquals(1,2);
    }
}
