package com.Bridgelabz;

import java.util.regex.Pattern;
@FunctionalInterface
interface UserDetailsValidationFI {
    boolean validate(String string) throws UserRegistrationException;
}
public class UserRegistration {
    // Using lambda function to check firstname Valid or Invalid
    UserDetailsValidationFI validateFirstName = firstName -> {
        // regex pattern for firstname
        if(Pattern.matches("[A-Z][a-z A-Z]{2,}", firstName))
            return true;
        else
            throw new UserRegistrationException("Invalid First Name");
    };

    // Using lambda function to check lastName Valid or Invalid
    UserDetailsValidationFI validateLastname = lastName -> {
        // regex pattern for lastname
        if(Pattern.matches("[A-Z][a-z A-Z]{2,}", lastName))
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");
    };

    // Using lambda function to check email Valid or Invalid
    UserDetailsValidationFI validateEmail= email -> {
        // regex pattern for email
        if(Pattern.matches("^[a-z]{3,}[.+-_]*[a-z0-9]*{3,}[@][a-z0-9]{1,}[.][a-z]{2,}[.]*[a-z]*{2,}$", email))
            return true;
        else
            throw new UserRegistrationException("Invalid Email");
    };

    // Using lambda function to check mobile number Valid or Invalid
    UserDetailsValidationFI validateMobileNumber = mobileNumber -> {
        // regex pattern for mobile number
        if(Pattern.matches("^[0-9]{2}[\s][0-9]{10}$", mobileNumber))
            return true;
        else
            throw new UserRegistrationException("Invalid Mobile Number");
    };
    // Using lambda function to check the password Valid or Invalid
    UserDetailsValidationFI validatePassword = password -> {
        // regex pattern for password
        if(Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z \\d $&+,:;=?@#|'<>.-^*()%!]{8,}", password))
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    };
    public static void main(String[] args) {
        System.out.println("Welcome in User Registration program");
    }
}
