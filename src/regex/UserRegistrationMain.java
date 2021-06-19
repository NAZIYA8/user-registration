/**
 * ****************************************************************************
 * Purpose: This class contains main method where the program execution is
 * carried out.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 19-06-2021
 * *****************************************************************************
 */

package regex;

public class UserRegistrationMain {

    static UserRegistration user = new UserRegistration();

    public static void main(String[] args) {
        user.validateFirstName();
        user.validateLastName();
        user.validateEmail();
        user.validatePhoneNumber();
        user.validatePassword();
    }
}
