package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmpLoginTest extends AppUtils 
{

	@Parameters({"uid","pwd"})
	@Test
	public void checkEmpLogin(String uid,String pwd)
	{
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		boolean res = lp.isEmpModuleDisplayed();
		Assert.assertFalse(res);
		lp.logout();
	}
	
	
}
