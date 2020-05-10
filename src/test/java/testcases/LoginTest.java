package testcases;

import java.sql.Driver;
import java.util.Hashtable;


import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;
import utilities.Utility;

public class LoginTest {
	
	@Test(dataProviderClass = Utility.class,dataProvider = "CommonDP")
	public void loginTest(Hashtable<String, String> data)
	{  //String userNameString,String passWordString
		HomePage home= new HomePage();
		LoginPage loginPage=home.goToLogin();
		System.out.println("User Name:"+data.get("userName")+ "password: "+ data.get("passWord"));
		loginPage.doLogin(data.get("userName"), data.get("passWord"));
	 try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		//ZohoAppPage appPage=loginPage.doLogin("maligulabchandra89@gmail.com", "Udemy@selenium1495");
		
	}

}
