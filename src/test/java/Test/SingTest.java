package Test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingTest {

    @Test
    public void testOpenWindow() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\opet\\Downloads\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait (navegador, 10);


        navegador.get("http://homologacao.mobilis.com.br:8080/mobiweb/#/login");
        navegador.findElement(By.id("md-input-1")).sendKeys("04257709901");
        navegador.findElement(By.id("md-input-3")).sendKeys("123abc");

        navegador.findElement(By.className("sign-card")).findElement(By.className("mat-raised-button")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/md-sidenav-container/div[2]/div/login/login-view/div/md-card/md-card-content/div[2]/md-nav-list/md-list-item[1]/div/a")));
        navegador.findElement(By.xpath("/html/body/app-root/md-sidenav-container/div[2]/div/login/login-view/div/md-card/md-card-content/div[2]/md-nav-list/md-list-item[1]/div/a")).click();
        
    }
}
