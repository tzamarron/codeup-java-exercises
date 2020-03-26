package util;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Input {
    private static Scanner scanner;
    public static void setScanner(Scanner input) {
        scanner = input;
    }

    public String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.print("Enter a string: ");
        System.out.printf("\n%s\n",prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes?");
        String isConfirmed = scanner.nextLine();
        return isConfirmed.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt){
        System.out.println("Yes?");
        String isConfirmed = scanner.nextLine();
        System.out.printf("\n %s \n",prompt);
        return isConfirmed.equalsIgnoreCase("yes");
    }

    int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d: ",min, max);
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            System.out.printf("That is not a number between %d and %d\n",min,max);
            return getInt(min,max);
        }
    }

    int getInt(int min, int max, String prompt){
        System.out.printf("Enter a number between %d and %d: ",min, max);
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max){
            System.out.printf("\n%s\n",prompt);
            return userNumber;
        } else {
            System.out.printf("That is not a number between %d and %d\n",min,max);
            return getInt(min,max);
        }
    }

    int getInt(){
        System.out.print("Enter a Interger: ");
        return scanner.nextInt();
    }

    int getInt(String prompt){
        System.out.print("Enter a Interger: ");
        System.out.printf("\n%s\n",prompt);
        return scanner.nextInt();
    }

    double getDouble(double min, double max){
        System.out.printf("Enter a decimal number between %d and %d",min,max);
        double userNumber = scanner.nextDouble();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            System.out.printf("That is not a number between %d and %d\n",min,max);
            return getDouble(min,max);
        }
    }

    double getDouble(double min, double max,String prompt){
        System.out.printf("Enter a decimal number between %d and %d",min,max);
        double userNumber = scanner.nextDouble();
        if (userNumber >= min && userNumber <= max){
            System.out.printf("\n%s\n",prompt);
            return userNumber;
        } else {
            System.out.printf("That is not a number between %d and %d\n",min,max);
            return getDouble(min,max);
        }
    }

    double getDouble(){
        System.out.println("Enter a decimal number: ");
        return scanner.nextDouble();
    }

    double getDouble(String prompt){
        System.out.println("Enter a decimal number: ");
        System.out.printf("\n%s\n",prompt);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        setScanner(scanner);
        Input test = new Input();
//        System.out.println(test.getString());
//        System.out.println(test.yesNo());
//        System.out.println( test.getInt(1,20) );
//        System.out.println(test.getInt());
//        System.out.println(test.getDouble(1.5,5.7));
//        System.out.println(test.getDouble());

    }
}
