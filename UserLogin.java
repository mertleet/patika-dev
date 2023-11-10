package Java101;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        String username, password;
        System.out.println("Enter your username: ");
        username = scf.nextLine();
        System.out.println("Enter your password: ");
        password = scf.nextLine();
        if (username.equals("patika") && (password.equals("1234567"))) {
            System.out.println("Login success");
        }
        else {
            System.out.println("Password is wrong. Dare to change? y/n");
            char decision = scf.next().charAt(0);
            switch (decision) {
                case 'y':
                    Scanner scf2 =  new Scanner(System.in);
                    System.out.println("Choose a new password. Different from the previous one.");
                    String newPassword = scf2.nextLine();
                    checkPassword(newPassword, password);
                    break;
                case 'n':
                    System.out.println("Closing the program.");
                    break;
                default:
                    System.out.println("Enter only y or n.");
            }
        }
    }
    static void checkPassword(String newPassword, String password) {
        if (newPassword.equals(password)) {
            System.out.println("Your password should be something other than your previous one.");
        }
        else {
            System.out.println("Your password has been changed successfully. Your new password is: " + " " + newPassword);
        }
    }
}