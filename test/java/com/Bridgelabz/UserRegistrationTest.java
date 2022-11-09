package com.Bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    // positive test case  for firstName return true
    @Test
    public void validateFirstNameTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateFirstName("Devendra");
        Assert.assertTrue(actualOutput);
    }
    // negative test case for firstName return false
    @Test
    public void validateFirstNameTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateFirstName("devendra");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid First Name", exception.getMessage());
        }

    }
    // positive test case for lastName return true
    @Test
    public void validateLastNameTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateLastname("Dhumale");
        Assert.assertTrue(actualOutput);
    }
    // negative test case for lastName return false
    @Test
    public void validateLastNameTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateLastname("dhumale");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Last Name", exception.getMessage());
        }
    }
    // positive test case for email return true
    @Test
    public void validateEmailTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateEmail("deven.dhumale@gmail.com");
        Assert.assertTrue(actualOutput);
    }
    // negative test case for email return false
    @Test
    public void validateEmailTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateEmail("dev@@in.");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Email", exception.getMessage());
        }
    }
    // positive test case for mobile number return true
    @Test
    public void validateMobileNumberReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateMobileNumber("91 9004141581");
        Assert.assertTrue(actualOutput);
    }
    // negative test case for mobile number return false
    @Test
    public void validateMobileNumberReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateMobileNumber("+91902977");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Mobile Number", exception.getMessage());
        }
    }
    // positive test case for password return true
    @Test
    public void validatePasswordReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validatePassword("Devendra@123");
        Assert.assertTrue(actualOutput);
    }
    // negative test case for password return false
    @Test
    public void validatePasswordReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validatePassword("deven@30");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Password", exception.getMessage());
        }
    }
}
