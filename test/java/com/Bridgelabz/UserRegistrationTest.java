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
    // positive test case for valid emails return true
    @Test
    public void validEmailValidationTest(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput1 = userRegistration.validateEmail("abc@yahoo.com");
        Assert.assertTrue(actualOutput1);
        boolean actualOutput2 = userRegistration.validateEmail("abc-100@yahoo.com");
        Assert.assertTrue(actualOutput2);
        boolean actualOutput3 = userRegistration.validateEmail("abc.100@yahoo.com");
        Assert.assertTrue(actualOutput3);
        boolean actualOutput4 = userRegistration.validateEmail("abc111@abc.com");
        Assert.assertTrue(actualOutput4);
        boolean actualOutput5 = userRegistration.validateEmail("abc-100@abc.net");
        Assert.assertTrue(actualOutput5);
        boolean actualOutput6 = userRegistration.validateEmail("abc@1.com");
        Assert.assertTrue(actualOutput6);
        boolean actualOutput7 = userRegistration.validateEmail("abc+100@gmail.com");
        Assert.assertTrue(actualOutput7);
    }

    // negative test case for invalid emails return false
    @Test
    public void invalidEmailValidationTest(){
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput1 = userRegistration.validateEmail("abc");
        Assert.assertFalse(actualOutput1);
        boolean actualOutput2 = userRegistration.validateEmail("abc@.com.my");
        Assert.assertFalse(actualOutput2);
        boolean actualOutput3 = userRegistration.validateEmail("abc123@gmail.a");
        Assert.assertFalse(actualOutput3);
        boolean actualOutput4 = userRegistration.validateEmail("abc123@.com");
        Assert.assertFalse(actualOutput4);
        boolean actualOutput5 = userRegistration.validateEmail("abc123@.com.com");
        Assert.assertFalse(actualOutput5);
        boolean actualOutput6 = userRegistration.validateEmail("abc@abc..com");
        Assert.assertFalse(actualOutput6);
        boolean actualOutput7 = userRegistration.validateEmail("abc()*@gmail.com");
        Assert.assertFalse(actualOutput7);
        boolean actualOutput8 = userRegistration.validateEmail("abc@%*.com");
        Assert.assertFalse(actualOutput8);
        boolean actualOutput9 = userRegistration.validateEmail("abc..2002@gmail.com");
        Assert.assertFalse(actualOutput9);
        boolean actualOutput10 = userRegistration.validateEmail("abc.@gmail.com");
        Assert.assertFalse(actualOutput10);
        boolean actualOutput11 = userRegistration.validateEmail("abc@abc@gmail.com");
        Assert.assertFalse(actualOutput11);
        boolean actualOutput12 = userRegistration.validateEmail("abc@gamil.com.1a");
        Assert.assertFalse(actualOutput12);
        boolean actualOutput13 = userRegistration.validateEmail("abc@gmail.com.aa.au");
        Assert.assertFalse(actualOutput13);

    }
}
