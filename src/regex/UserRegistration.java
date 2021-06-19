/**
 * ****************************************************************************
 * Purpose: This class contains a number of methods. It helps the main method
 * to call these methods any number of times.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 17-06-2021
 * ****************************************************************************
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static Scanner scan = new Scanner(System.in);

    /**
     * This method is used to take the  first name as input and
     * check if it is valid or not.
     */
    public void validateFirstName() {
        System.out.println("Enter First Name ");
        String firstName = scan.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher((firstName));
        boolean check = matcher.matches();
        if (check) {
            System.out.println("First Name is Valid");
        } else {
            System.out.println("First name is invalid");
        }
    }

    /**
     * This method is used to take the last name as input and
     * check if it is valid or not.
     */
    public void validateLastName() {
        System.out.println("Enter Last Name ");
        String lastName = scan.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher((lastName));
        boolean check = matcher.matches();
        if (check) {
            System.out.println("Last Name is Valid");
        } else {
            System.out.println("Last name is invalid");
        }
    }

    /**
     * This method is used to take the Email id of user as input
     * and check if it is valid or not.
     */
    public void validateEmail() {
        System.out.println("Enter Email Id");
        String email = scan.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        Matcher matcher = pattern.matcher((email));
        boolean check = matcher.matches();
        if (check) {
            System.out.println("Entered Email Id is Valid");
        } else {
            System.out.println("Entered Email Id is Invalid");
        }
    }

    /**
     * This method is used to take the Phone number as input and
     * checks if it is valid or not.
     */
    public void validatePhoneNumber() {
        System.out.println("Enter the phone number ");
        String phoneNumber = scan.nextLine();
        Pattern pattern = Pattern.compile("^[0-9]{2}\\s{1}[0-9]{10}");
        Matcher matcher = pattern.matcher((phoneNumber));
        boolean check = matcher.matches();
        if (check) {
            System.out.println("Entered Phone Number is Valid");
        } else {
            System.out.println("Entered Phone Number is Invalid");
        }
    }

    /**
     * UC5:This method is used to take the Password as input and
     * checks if it is valid or not.
     * Rule1: Minimum 8 characters.
     * Rule2: Should have atleast 1 upper case.
     */
    public void validatePassword() {
        System.out.println("Enter the password ");
        String password = scan.nextLine();
        Pattern pattern = Pattern.compile("^(?=.*[A-Z]).{8,}$");
        Matcher matcher = pattern.matcher((password));
        boolean check = matcher.matches();
        if (check) {
            System.out.println("Entered Password is Valid");
        } else {
            System.out.println("Entered Password is Invalid");
        }
    }
}