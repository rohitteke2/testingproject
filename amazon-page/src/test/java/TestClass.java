import static org.testng.Assert.fail;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {

	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	@Test (priority = 1, invocationCount = 2, dependsOnMethods= {"test2"})
	public void test1() 
	{
		System.out.println("test1");
	}
	@Test 
	public void test2()
	{
		System.out.println("test2");
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	
	
	
	
	
}
