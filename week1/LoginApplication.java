package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginApplication {
	public static void main(String[] args)  {
				
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sshafanabee@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Shafana@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		}
		
			

		}

	