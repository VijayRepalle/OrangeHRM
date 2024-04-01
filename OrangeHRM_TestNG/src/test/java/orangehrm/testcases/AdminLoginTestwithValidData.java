package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithValidData extends AppUtils 
{

	@Parameters({"uname","pword"})
	@Test
	public void checkAdminLogin(String uid,String pwd)
	{
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		boolean res = lp.isAdminModuleDisplayed();
		Assert.assertTrue(res);
		lp.logout();		
	}
	
	
	
}
