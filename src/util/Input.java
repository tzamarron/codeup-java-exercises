package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in); // Creates Scanner for class

    // Method will capture string input and return it
    public String getString() {
        return scanner.nextLine();
    }

    // Using provided prompt method will then
    // capture and return string input
    public String getString(String prompt) {
        System.out.printf("\n%s\n", prompt);
        return scanner.nextLine();
    }

    // Method will capture the first character of the input provided.
    // Confirms it is a 'y' or 'n' else waits for correct input
    // then returns a boolean
    public boolean yesNo() {
        char response = scanner.next().trim().toLowerCase().charAt(0);
        if (Character.compare(response, 'y') == 0) {
            return true;
        } else if (Character.compare(response, 'n') == 0) {
            return false;
        } else {
            return yesNo();
        }
    }

    // Shows given prompt first then method
    // capture the first character of the input provided
    // Confirms it is a 'y' or 'n' else waits for correct input
    // then returns a boolean
    public boolean yesNo(String prompt) {
        System.out.printf("\n %s \n", prompt);
        String response = scanner.nextLine().toLowerCase().trim();
        if (response.startsWith("y")) {
            return true;
        } else if (response.startsWith("n")) {
            return false;
        } else {
            return yesNo();
        }
    }

    // Method captures integer input
    // then returns integer if with range of
    // min and max else prompts for correct
    // integer
    public int getInt(int min, int max) {
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.printf("That is not a number between %d and %d\n", min, max);
            return getInt(min, max);
        }
    }

    // Method will capture integer input
    // then returns integer if with range of
    // min and max else prompts for correct
    // integer
    public int getInt(int min, int max, String prompt) {
        System.out.printf("\n%s\n", prompt);
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.printf("That is not a number between %d and %d\n", min, max);
            return getInt(min, max);
        }
    }

    // Method captures and return integer
    public int getInt() {
        return scanner.nextInt();
    }

    // Using provided prompt Method wil capture and return integer
    public int getInt(String prompt) {
        System.out.printf("\n%s\n", prompt);
        return scanner.nextInt();
    }

    // Method will capture and return double if
    // with range of min and max else prompts
    // for correct integer
    public double getDouble(double min, double max) {
        double userNumber = scanner.nextDouble();
        if (userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.printf("That is not a number between %f and %f\n", min, max);
            return getDouble(min, max);
        }
    }

    // Using provided prompt method will
    // capture and return double if within
    // range of min and max else prompts
    // for correct integer
    public double getDouble(double min, double max, String prompt) {
        System.out.printf("\n%s\n", prompt);
        double userNumber = scanner.nextDouble();
        if (userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.printf("That is not a number between %d and %d\n", min, max);
            return getDouble(min, max);
        }
    }

    // Method will capture and return double
    public double getDouble() {
        return scanner.nextDouble();
    }

    // Using provided prompt method will capture
    // and return provided double
    public double getDouble(String prompt) {
        System.out.printf("\n%s\n", prompt);
        return scanner.nextDouble();
    }


}
