package main;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPage extends basepage{
	
	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a[@title='Dresses']")
	private WebElement dresslink;
	
	@FindBy(xpath="//form[@id='layered_form']//div[2]//li[1]")
	private WebElement small;
	
	@FindBy(xpath="//form[@id='layered_form']//div[2]//li[2]")
	private WebElement medium;
	
	@FindBy(xpath="//form[@id='layered_form']//div[2]//li[2]")
	private WebElement large;
	
	@FindBy(xpath="//h1/span[2]")
	private WebElement prolist;
	
	@FindBy(xpath="//select[@id='selectProductSort']")
	private WebElement scrolloption;
	
	@FindBy(xpath="//li[1]//div[@class='product-image-container']//a[1]/img")
	private WebElement imglink;
	
	@FindBy(xpath="//li[1]//a[@title='Add to cart']")
	private WebElement fp;
	
	@FindBy(xpath="//div/span[@title='Close window']")
	private WebElement close;
	
	@FindBy(xpath="//a[@title='View my shopping cart']//span[1]")
	private WebElement cartno;
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement protxt;
	
	@FindBys({@FindBy(xpath="//ul[@class='product_list grid row']/li")})
	private List<WebElement> pronum;
	
	public DressesPage() {
		PageFactory.initElements(driver, this);
		}
	
	public WebElement getDressLink() {
		return dresslink;
	}
	
	public WebElement getLarge() {
		return large;
	}
	
	public WebElement getMedium() {
		return medium;
	}
		
	public WebElement getSmall() {
		return small;
	}	
	
	public WebElement getScrollOption() {
		return scrolloption;
	}	
	
	public WebElement getImgLink() {
		return imglink;
	}
	
	public WebElement getFP() {
		return fp;
	}
	
	public WebElement getClose() {
		return close;
	}

	public WebElement getCartNo() {
		return cartno;
	}
	
	public WebElement getProTxt() {
		return protxt;
	}
	public List<WebElement> getProNum() 
	{
		return pronum;//.size();
	}
}