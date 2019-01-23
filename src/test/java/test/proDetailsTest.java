package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.basepage;
import main.proDetails;

public class proDetailsTest {
	
	proDetails pd;
	basepage bp;
	
	public proDetailsTest() {
		pd=new proDetails();
		bp=new basepage();		
	}
		
	@Test
	public void verifySocialSharing() {
		bp.click(pd.getDressLink());
		bp.mousehover(pd.getImgLink());
		bp.click(pd.getMoreBtn());
		Assert.assertTrue(bp.elementFound(pd.getTweet()));		
		Assert.assertTrue(bp.elementFound(pd.getShare()));		
	}
	
	@Test
	public void verifyProDes() {
		bp.isElementVisible(pd.getProDes())	;
	}

}
