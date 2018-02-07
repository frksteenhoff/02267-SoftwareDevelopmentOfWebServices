package junitTest;


import org.junit.Test;
import merchant.Merchant;
import static org.junit.Assert.*;


/**
 * @author Michael
 */
public class MerchantTest {
	 private static final String cvr = "12345678";
	 private static final String companyName = "Netto Lyngby";
	 
	@Test
	public void createMerchant() {
		Merchant testMerchant = new Merchant(cvr, companyName);
		assertEquals(cvr, testMerchant.getCvr());
		assertEquals(companyName, testMerchant.getName());
	}
	
}
