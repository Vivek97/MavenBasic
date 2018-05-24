package com.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestClassOne {
	
	

	 
	 

	    
	  @Test
	  public void ClassOneTestOne() {
	    Assert.assertTrue(true);
	  }
	  
	  @Test
	  public void ClassOneTestTwo() {
	    Assert.fail();
	  }
	  
	  @Test
	  public void ClassOneTestThree() {
		  Assert.assertTrue(true);
	  }
	  
	  
	}
