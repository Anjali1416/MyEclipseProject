package projectpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class script extends login{
@BeforeTest
	public  void beforetest()
	{
	browserLaunch();
	}

@Test
	public void test() {
		System.out.println("hello");
		d.get("http://www.facebook.com");
		Jump();
	}		

@AfterTest
	public  void aftertest()
	{
	d.close();
	}
	}

