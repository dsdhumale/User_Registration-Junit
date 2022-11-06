package com.Bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    // method to check firstname Valid or Invalid
    public boolean validateFirstName(String firstName) {
        // regex pattern for firstname
        return Pattern.matches("[A-Z]{1}[a-zA-Z]{2,}", firstName);
    }
    // method to check lastName Valid or Invalid
    public boolean validateLastname(String lastName) {
        // regex pattern for lastname
        return Pattern.matches("[A-Z]{1}[a-zA-Z]{2,}", lastName);
    }

    // method to check email Valid or Invalid
    public boolean validateEmail(String email) {
        // regex pattern for email
        return Pattern.matches("[\\w+-]+(?:\\.[\\w+-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}", email);
    }

    // method to check mobile number Valid or Invalid
    public boolean validateMobileNumber(String mobileNumber) {
        // regex pattern for mobile number
        return Pattern.matches("[0-9]{2}[\s][0-9]{10}", mobileNumber);
    }

    // method to check the password Valid
    public boolean validatePassword(String password) {
        // regex pattern for password
        return Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}", password);
    }
    public static void main(String[] args) {
        System.out.println("Welcome in User Registration program");
    }
}
