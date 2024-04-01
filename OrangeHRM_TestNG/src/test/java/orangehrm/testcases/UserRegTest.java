package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.AdminUtils;
import orangehrm.library.User;
import utils.AppUtils;

public class UserRegTest extends AdminUtils
{

	@Parameters({"role","empname","uname","pword"})
	@Test
	public void checkUserReg(String role,String empname,String uname,String pword) throws InterruptedException
	{
		
		User us = new User();
		boolean res = us.addUser(role, empname, uname, pword);
		Assert.assertTrue(res);		
	}
	
	
}
