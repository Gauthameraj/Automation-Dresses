package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.DressesPage;
import main.basepage;

public class DressesTest {
	
	DressesPage dp;
	basepage bp;
	
	public DressesTest() {
		dp=new DressesPage();
		bp=new basepage();
	}
	
	@Test(priority=0)
	public void verifySizes() {
		bp.mousehover(dp.getDressLink());
		bp.click(dp.getDressLink());
		Assert.assertTrue(bp.elementFound(dp.getLarge()));
		Assert.assertTrue(bp.elementFound(dp.getMedium()));
		Assert.assertTrue(bp.elementFound(dp.getSmall()));
	}
	
	@Test(priority=1)
	public void verifySorting() {
		bp.selectFromDropDown(dp.getScrollOption(), "price:asc");
	}
	
	@Test(priority=2)
	public void verifyCart() {	
		bp.mousehover(dp.getImgLink());
		bp.click(dp.getFP());
		bp.click(dp.getClose());
		dp.verifytext(dp.getCartNo(),1);
	}
	
	@Test(priority=3)
	public void verifyProNumber() {
		Assert.assertEquals(dp.getProNum().size(), bp.splitstring(dp.getProTxt(), 2));
	}
	
}
