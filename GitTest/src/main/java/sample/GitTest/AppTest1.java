package sample.GitTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest1 {
	protected WebDriver driver;
	@Test
	public void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String eTitle = "Meet Guru99";
		String aTitle = "";
		
		// launch Chrome and redirect it to the Base  URL.
		driver.get("http://www.guru99.com/");
		
		// Maximize the brwoser window.
		driver.manage().window().maximize();
		
		// Get the actual page title.
		aTitle = driver.getTitle();
		
		// Compare the actual title with the expected title.
		if (aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		// Close Chrome browser.
		driver.close();
	}
}

