package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.Page;
import base.TopMenu;
import crmAccounts.AccountsPage;
import crmAccounts.CreateAccountPage;
import pages.ZohoAppPage;
import utilities.Utility;

public class CreateAccountTest {

	@Test(dataProviderClass = Utility.class,dataProvider = "CommonDP")
	public void createAccountTest(Hashtable<String, String> data)
	{
		ZohoAppPage zPage = new ZohoAppPage();
		zPage.goToCRM();
		
		//TopMenu menu= new TopMenu();
		AccountsPage accountPage= Page.menu.goToAccounts();
		
		CreateAccountPage createAccountPage= accountPage.goToCreateAccounts();
		createAccountPage.CreateAccount(data.get("firstName"));
		
	}
	
}
