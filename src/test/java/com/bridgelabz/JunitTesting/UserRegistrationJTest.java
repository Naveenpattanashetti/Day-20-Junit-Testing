package com.bridgelabz.JunitTesting;

import org.junit.Test;

import junit.framework.Assert;

public class UserRegistrationJTest {
	UserRegistrationJ userRegistration = new UserRegistrationJ();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Naveen");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
		boolean result = userRegistration.firstName("naveen");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Pattanashetti");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("pattanashetti");
		Assert.assertEquals(false, result);

	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.email("pattanashettinaveen@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.email("pattanashetti&naveen@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.phoneNumber("91 9844415351");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
		boolean result = userRegistration.phoneNumber("919844415351");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password("naveen@123");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password("navi@22");
		Assert.assertEquals(false, result);
	}
	  @Test
	    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.passwordRule2("passWord@123");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.passwordRule2("nhp@");
	        Assert.assertEquals(false, result);
	    }
}
