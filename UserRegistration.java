package bridgeLab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserRegistration extends UserRegistrationProblem {
	
	public void HappyTest() {
		System.out.println("Happy Test");
	}
	
	@Test
	void happyTest() {
		boolean fname = UserRegistrationProblem.check("Ashvini", "^[A-Z][a-z]{2,15}$");
		Assert.assertEquals(true, fname);
	}
	
	@Test
	void happyTest2() {
		boolean lname = UserRegistrationProblem.check("Deokate", "^[A-Z][a-z]{2,15}$");
		Assert.assertEquals(true, lname);
	}
	
	@Test
	void happyTest3() {
		boolean email = UserRegistrationProblem.check("ashvini@gmail.com", "^[a-z.]+[@][a-z.]+[.][a-z]{2,3}$");
		Assert.assertEquals(true,email);
	}
	
	@Test
	void happyTest4() {
		boolean number = UserRegistrationProblem.check("917798639808","^[1-9]{2}[1-9]{1}[0-9]{9}$");
		Assert.assertEquals(true,number);
	}

	@Test
	void happyTest5() {
		boolean pass = UserRegistrationProblem.check("Ashvini123@", "[A-Z]{1,}[a-z]{6,}[0-9]{1,}[#$&%@]{1}");
		Assert.assertEquals(true,pass);
	}
	
	public void SadTest() {
		System.out.println("Sad Test");
	}
	
	@Test
	void sadTest() {
		boolean fname = UserRegistrationProblem.check("ashvini", "^[A-Z][a-z]{2,15}$");
		Assert.assertEquals(true, fname);
	}
	
	@Test
	void sadTest2() {
		boolean lname = UserRegistrationProblem.check("deokate", "^[A-Z][a-z]{2,15}$");
		Assert.assertEquals(true, lname);
	}
	
	@Test
	void sadTest3() {
		boolean email = UserRegistrationProblem.check("ashvinigmail.com", "^[a-z.]+[@][a-z.]+[.][a-z]{2,3}$");
		Assert.assertEquals(true,email);
	}
	
	@Test
	void sadTest4() {
		boolean number = UserRegistrationProblem.check("9178639808","^[1-9]{2}[1-9]{1}[0-9]{9}$");
		Assert.assertEquals(true,number);
	}

	@Test
	void sadTest5() {
		boolean pass = UserRegistrationProblem.check("Ashvini123", "[A-Z]{1,}[a-z]{6,}[0-9]{1,}[#$&%@]{1}");
		Assert.assertEquals(true,pass);
	}

}
