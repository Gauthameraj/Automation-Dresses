package main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proDetails extends basepage{
	
	@FindBy(xpath="//ul[contains(@class,'menu-content')]/li[2]/a[@title='Dresses']")
	private WebElement dresslink;
	
	@FindBy(xpath="//li[1]//div[@class='product-image-container']//a[1]/img")
	private WebElement imglink;
	
	@FindBy(xpath="//li[1]//a[2][@title='View']")
	private WebElement morebtn;
	
	@FindBy(xpath="//button[contains (@class,'btn-twitter')]")
	private WebElement tweet;
	@FindBy(xpath="//button[contains (@class,'btn-facebook')]")
	private WebElement share;
	@FindBy(xpath="//div[@id='short_description_content']/p")
	private WebElement proDes;

	
	public proDetails(){
		PageFactory.initElements(driver, this);;
	}
	
	public WebElement getDressLink() {
		return dresslink;
	}
	
	public WebElement getImgLink() {
		return imglink;
	}
	
	public WebElement getMoreBtn() {
		return morebtn;
	}
	
	public WebElement getTweet() {
		return tweet;
	}
	
	public WebElement getShare() {
		return share;
	}
	
	public WebElement getProDes() {
		return proDes;
	}
}
