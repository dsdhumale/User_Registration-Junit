package com.Bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    // method to check firstname Valid or Invalid
    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        // regex pattern for firstname
        if(Pattern.matches("[A-Z][a-z A-Z]{2,}", firstName))
            return true;
        else
            throw new UserRegistrationException("Invalid First Name");
    }

    // method to check lastName Valid or Invalid
    public boolean validateLastname(String lastName) throws UserRegistrationException {
        // regex pattern for lastname
        if(Pattern.matches("[A-Z][a-z A-Z]{2,}", lastName))
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");
    }

    // method to check email Valid or Invalid
    public boolean validateEmail(String email) throws UserRegistrationException {
        // regex pattern for email
        if(Pattern.matches("^[a-z]{3,}[.+-_]*[a-z0-9]*{3,}[@][a-z0-9]{1,}[.][a-z]{2,}[.]*[a-z]*{2,}$", email))
            return true;
        else
            throw new UserRegistrationException("Invalid Email");
    }

    // method to check mobile number Valid or Invalid
    public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException {
        // regex pattern for mobile number
        if(Pattern.matches("^[0-9]{2}[\s][0-9]{10}$", mobileNumber))
            return true;
        else
            throw new UserRegistrationException("Invalid Mobile Number");
    }
    // method to check the password Valid or Invalid
    public boolean validatePassword(String password) throws UserRegistrationException {
        // regex pattern for password
        if(Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z \\d $&+,:;=?@#|'<>.-^*()%!]{8,}", password))
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    }
    public static void main(String[] args) {
        System.out.println("Welcome in User Registration program");
    }
}
