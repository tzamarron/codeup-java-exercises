package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.printf("\n%s\n",prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        char response = scanner.next().toLowerCase().charAt(0);
        if (Character.compare(response,'y') == 0) {
            return true;
        } else if (Character.compare(response,'n') == 0) {
            return false;
        } else {
            return yesNo();
        }
    }

    public boolean yesNo(String prompt){
        System.out.printf("\n %s \n",prompt);
        char response = scanner.next().toLowerCase().charAt(0);
        if (Character.compare(response,'y') == 0) {
            return true;
        } else if (Character.compare(response,'n') == 0) {
            return false;
        } else {
            return yesNo();
        }
    }

    public int getInt(int min, int max){
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            System.out.printf("That is not a number between %d and %d\n",min,max);
            return getInt(min,max);
        }
    }

    public int getInt(int min, int max, String prompt){
        System.out.printf("\n%s\n",prompt);
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            System.out.printf("That is not a number between %d and %d\n",min,max);
            return getInt(min,max);
        }
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public int getInt(String prompt){
        System.out.printf("\n%s\n",prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        double userNumber = scanner.nextDouble();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            System.out.printf("That is not a number between %f and %f\n",min,max);
            return getDouble(min,max);
        }
    }

    public double getDouble(double min, double max,String prompt){
        System.out.printf("\n%s\n",prompt);
        double userNumber = scanner.nextDouble();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            System.out.printf("That is not a number between %d and %d\n",min,max);
            return getDouble(min,max);
        }
    }

    public double getDouble(){
        return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.printf("\n%s\n",prompt);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Input test = new Input();
//        System.out.println(test.getString());
//        System.out.println(test.yesNo());
//        System.out.println( test.getInt(1,20) );
//        System.out.println(test.getInt());
//        System.out.println(test.getDouble(1.5,5.7));
//        System.out.println(test.getDouble());

    }
}
