package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class basepage {
	
	public static WebDriver driver;
	public String browser = "chrome";
	public basepage() 
	{
		if (driver == null)
		{
				if (browser.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","D:\\Project\\chromedriver_win32\\chromedriver.exe");
					driver = new ChromeDriver();
				} 
				else if (browser.equals("firefox"))
				{
					System.setProperty("webdriver.gecko.driver", "D:\\Project\\geckodriver-v0.23.0-win64\\geckodriver.exe");
					driver = new FirefoxDriver();
				}
				driver.manage().window().maximize();
	
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
				driver.get("http://automationpractice.com/index.php");
		}
	}
	
	public void Wait() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 950)");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("@FindBy(xpath=\"li[1]//div[@class='product-container']//a[1]/img\")")));
	}
	
	public void setText(WebElement element, String name) 
		{
			if (name != null) {
				element.click();
				element.clear();
				element.sendKeys(name);
			}
		}	
	
	public boolean elementFound(WebElement element) {
		boolean res = false;
		try {
		res = element.isDisplayed();
		} catch (Exception e) {
		e.printStackTrace();
		}
		return res;
		}
	
	public String getTxtAttribute(WebElement element)
		{
			return element.getAttribute("value");
		}
	
	public Boolean verifytext(WebElement element, String s)
	{
		try
		{
			String txt=element.getText();
			if(txt.contains(s))
				return true;
		}
			catch(Exception e)
			{
				return false;
			}
			return null;
	}
	
	
	public Boolean verifytext(WebElement element,int i)
	{
		try
		{
			String s=element.getAttribute("value");
			int val=Integer.parseInt(s);
			if(val==i)
				return true;
		}
			catch(Exception e)
			{
				return false;
			}
			return null;
	}
	
	public boolean isElementVisible(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
		
	public String selectFromDropDown(WebElement element,String val) {
		Select obj = new Select(element);
		obj.selectByValue(val);
		return obj.getFirstSelectedOption().getText();
	}
	
	public void mousehover(WebElement element)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	
	public void click(WebElement element)
	{
		element.click();
	}
	
	public void hoverclick(WebElement element)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}
	
	public int splitstring(WebElement input, int i)
	{
		String StrMain= input.getText();
		String[] arrSplit=StrMain.split("\\s");
		int val=Integer.parseInt(arrSplit[i]);
		return val;
	}
	
	public void navigate(){
		driver.navigate().back();
	}
	
	public String title() {
		return driver.getCurrentUrl();
	}
}
