package registrationandlogin;

import java.util.Scanner;

public class RegistrationAndLogin {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Registration Details");
        System.out.println("please fill out the following information");
        System.out.println("");

        System.out.println("Enter your First Name : ");
        String firstName = read.nextLine();

        System.out.println("Enter your Last name: ");
        String lastName = read.nextLine();

        String username;
        boolean isValid = false;
        do {
            System.out.println("Please enter a username with an underscore and consisting of 5 characters only: ");
            username = read.nextLine();

            if (username.length() > 5 || !username.contains("_")) {
                System.out.println("Invalid username, please try again.");
            } else {
                isValid = true;
            }
        } while (!isValid);

        System.out.println("Your username is: " + username);

        System.out.println("PLease nter password (min of 8 characters, must contain at least one uppercase letter, one number, and one special character): ");
        String password = read.nextLine();

        boolean hasUppercase = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (c >= 33 && c <= 47 || c >= 58 && c <= 64 || c >= 91 && c <= 96 || c >= 123 && c <= 126) {
                hasSpecial = true;
            }
        }

        if (password.length() < 8 || !hasUppercase || !hasNumber || !hasSpecial) {
            System.out.println("Incorrect password, please try again.");
        } else {
            System.out.println("Thank you for registering with us " + firstName);
            System.out.println("Registration is successful.");
        }
    }
}