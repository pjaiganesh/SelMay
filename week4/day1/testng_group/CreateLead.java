package testng_group;

import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	@Test(groups="smoke")
	public void createLead() throws InterruptedException {
		throw new RuntimeException();
		/*click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
		type(locateElement("id", "createLeadForm_firstName"), "gopi");
		type(locateElement("id", "createLeadForm_lastName"), "J");
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "12345");
		click(locateElement("name", "submitButton"));*/	
	}		
	
	
	
	
	
	
	
	
}












