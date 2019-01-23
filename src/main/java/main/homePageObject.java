package main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageObject extends basepage{
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a[@title='Dresses']")
	private WebElement dresses;
	
	@FindBy(xpath="//ul[contains(@class,'menu-content')]/li[3]/a")
	private WebElement tshirts;
	
	@FindBy(id="newsletter-input")
	private WebElement subscription;
	
	@FindBy(xpath="//input[@id='newsletter-input']")
	private WebElement newsletter;
	
	public homePageObject() {
		PageFactory.initElements(driver, this);
		}
	
	public WebElement getWomen() {
		return women;
	}
	
	public WebElement getDresses() {
		return dresses;
	}
	
	public WebElement getTshirts() {
		return tshirts;
	}
	
	public WebElement getSubscription() {
		return subscription;
	}
	
	public WebElement getNewsLetter() {
		return newsletter;
	}

}
