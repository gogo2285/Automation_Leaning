package Batch2.Batch2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class simpleJunit {
	
	@Test
	public void print()
	{
System.out.println("test executing");
	}
	
	@Before
	public void before ()
	{
		System.out.println("before test");
	}
	
	@After
	public void after ()
	{
		System.out.println("after test");
	}
}
