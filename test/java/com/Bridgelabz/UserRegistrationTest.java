package com.Bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    // positive test case  for firstName return true
    @Test
    public void validateFirstNameTestReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateFirstName("Devendra");
        Assert.assertTrue(actualOutput);
    }

    // negative test case for firstName return false
    @Test
    public void validateFirstNameTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateFirstName("devendra");
        Assert.assertFalse(actualOutput);
    }
    // positive test case for lastName return true
    @Test
    public void validateLastNameTestReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateLastname("Dhumale");
        Assert.assertTrue(actualOutput);
    }

    // negative test case for lastName return false
    @Test
    public void validateLastNameTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateLastname("dhumale");
        Assert.assertFalse(actualOutput);
    }

    // positive test case for email return true
    @Test
    public void validateEmailTestReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateEmail("deven.dhumale@gmail.com");
        Assert.assertTrue(actualOutput);
    }

    // negative test case for email return false
    @Test
    public void validateEmailTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateEmail("a@bc@com.in");
        Assert.assertFalse(actualOutput);
    }

    // positive test case for mobile number return true
    @Test
    public void validateMobileNumberReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateMobileNumber("91 9004141581");
        Assert.assertTrue(actualOutput);
    }

    // negative test case for mobile number return false
    @Test
    public void validateMobileNumberReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateMobileNumber("+919004141581");
        Assert.assertFalse(actualOutput);
    }

    // positive test case for password return true
    @Test
    public void validatePasswordReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validatePassword("Devendra@123");
        Assert.assertTrue(actualOutput);
    }

    // negative test case for password return false
    @Test
    public void validatePasswordReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validatePassword("devendra@123");
        Assert.assertFalse(actualOutput);
    }
}
