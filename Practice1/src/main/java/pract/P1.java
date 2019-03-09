package pract;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P1 {
  @BeforeClass
  public void f1() {
	  System.out.println("d");
  }
  
  @BeforeTest
  public void f2() {
	  System.out.println("a");
  }
  
  @Test(dependsOnMethods= {"f11"})
  public void f10() {
	  System.out.println("section1");
  }
  
  	
  @Test
  public void f11() {
	  System.out.println("section2");
  }
  
  
  @Test
  public void f12() {
	  System.out.println("section3");
  }
  
  
  @Test
  public void f13() {
	  System.out.println("section4");
  }
  
  
  @Test
  public void f3() {
	  System.out.println("section5");
  }
  
  
  @AfterSuite
  public void f5() {
	  System.out.println("k");
  }
  
  @AfterClass
  public void f6() {
	  System.out.println("m");
  }
  
  @AfterTest
  public void f7() {
	  System.out.println("n");
  }
  
  @BeforeMethod
  public void f8() {
	  System.out.println("p");
  }
  
  @AfterMethod
  public void f9() {
	  System.out.println("r");
  }
  
  @BeforeSuite
  public void f4() {
	  System.out.println("c");
  }
}
