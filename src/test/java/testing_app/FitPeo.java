package testing_app;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FitPeo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
				driver.get("https://fitpeo.com");
driver.manage().window().maximize();

driver.findElement(By.linkText("Revenue Calculator")).click();
Thread.sleep(3000);

JavascriptExecutor js = (JavascriptExecutor)driver;	
js.executeScript("window.scrollBy(0,600);");
Thread.sleep(5000);

WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
Actions act = new Actions(driver);
act.clickAndHold(slider).moveByOffset(94, 0).release().perform();

Thread.sleep(4000);
JavascriptExecutor js1= (JavascriptExecutor)driver;	
js1.executeScript("window.scrollBy(0,200);");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='number']")).clear();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='number']")).sendKeys("560");

driver.findElement(By.xpath("//input[@type='checkbox']")).click();
Thread.sleep(9000);
driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]/input")).click();

JavascriptExecutor js2= (JavascriptExecutor)driver;	
js2.executeScript("window.scrollBy(0,400);");
driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input")).click();
Thread.sleep(4000);
JavascriptExecutor js3= (JavascriptExecutor)driver;	
js3.executeScript("window.scrollBy(0,800);");
Thread.sleep(8000);
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[8]/label/span[1]/input")).click();


}
}