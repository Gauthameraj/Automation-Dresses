package test;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.basepage;
import main.homePageObject;

public class homeTest {
	
	homePageObject hp;
	basepage bp;
	
	public homeTest() {
		hp=new homePageObject();
		bp=new basepage();
	}
		
	@Test
	public void verifySelectionTabs() {
		Assert.assertTrue(hp.getWomen().isDisplayed());
		Assert.assertTrue(hp.getDresses().isDisplayed());
		Assert.assertTrue(hp.getTshirts().isDisplayed());
	}
	
	@Test 
	public void verifyNavigation() {
		bp.hoverclick(hp.getWomen());
		Assert.assertEquals(bp.title(), "http://automationpractice.com/index.php?id_category=3&controller=category");
		bp.navigate();
		
		bp.hoverclick(hp.getDresses());
		Assert.assertEquals(bp.title(), "http://automationpractice.com/index.php?id_category=8&controller=category");
		bp.navigate();
		
		bp.hoverclick(hp.getTshirts());
		Assert.assertEquals(bp.title(), "http://automationpractice.com/index.php?id_category=5&controller=category");
		bp.navigate();
	}

	@Test
	public void verifySubscription() {
		bp.setText(hp.getSubscription(), "asd@gmail.com");
		hp.getSubscription().sendKeys(Keys.ENTER);
		Assert.assertEquals(bp.getTxtAttribute(hp.getNewsLetter()),"You have successfully subscribed to this newsletter.");	
	}
	
	
}
