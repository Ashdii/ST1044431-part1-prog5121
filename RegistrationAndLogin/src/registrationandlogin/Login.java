
package registrationandlogin;

import java.util.Scanner;


public class Login {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String username, password;
        
        System.out.println("Welcome to our login page,please enter your username and password to proceed: ");
        System.out.print("Please enter a username with an underscore and consisting of 5 characters only: ");
        username = scanner.nextLine();
        

        if (username.length() != 5 || !username.contains("_")) {
            System.out.println("Incorrect username, please try again");
            return;
        }

        System.out.print("PLease nter password (min of 8 characters, must contain at least one uppercase letter, one number, and one special character): ");
        password = scanner.nextLine();

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
        }
        
        

        System.out.println("Login successful!,have a lovely day");
    }
}
