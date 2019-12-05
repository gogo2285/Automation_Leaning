package testNg;

import org.testng.annotations.Test;

public class NewTest {
  @Test(groups = {"group1","group2"})
  public void f() {
	  System.out.println("all groups");
  }
  
  @Test(groups = {"group1"})
  public void g() {
	  System.out.println("groups 1");
  }
  
  @Test(groups = {"group2"})
  public void h() {
	  System.out.println("groups 2");
  }
  
}
