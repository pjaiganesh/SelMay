package wdMethods;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testNG.LearnExcel;

public class ProjectMethodsWithParameters extends SeMethods {	

	@Parameters({"url","userName","password"})
	@BeforeMethod
	public void login(String url,String userName, String password) {
		startApp("chrome", url);
		type(locateElement("id", "username"), userName);
		type(locateElement("id", "password"), password);
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}

	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}
	@DataProvider(name="fetchData")
	public Object[][] fetchData() throws IOException {
		LearnExcel excel = new LearnExcel();		
		return excel.readExcel();
		
	}

}
