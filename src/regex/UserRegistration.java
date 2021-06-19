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
    
}