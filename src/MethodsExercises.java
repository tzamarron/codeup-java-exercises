import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class MethodsExercises {

    public static int addNums(int num1, int num2){
        return num1 + num2;
    }

    public static int subtractNums(int num1, int num2){
        return num1 - num2;
    }

    public static int divideNums(int num1, int num2){
        return num1/num2;
        // Divide by zero gets an error
    }

    public static int multiplyNums(int num1, int num2){
//        return num1 * num2;

//        int result = 0;
//        for (int i = 1;i <= num2;i++){
//            result += num1;
//        }
//        return result;

        // Using recursion
        // if num1 is less than
        // num2 swap the numbers
        if (num1 < num2) {
            return multiplyNums(num2, num1);

            // iteratively calculate
            // num2 times sum of num1
        }else if (num2 != 0) {
            return (num1 + multiplyNums(num1, num2 - 1));
            // if any of the two numbers is
            // zero return zero
        } else {
            return 0;
        }
    }

    public static int modulusNum(int num1, int num2){
        return num1 % num2;
    }

    public static int getInteger(int min, int max){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ",min, max);
        int userNum = input.nextInt();

        if (userNum >= min && userNum <= max){
            System.out.print("Thanks for playing!");
            return userNum;
        } else{
            return getInteger(min, max);
        }
    }

    public static long factorial(long num){
        Scanner input = new Scanner(System.in);
        // Normal
//        long result = 1;
//        // Verify user number is valid
//        if (num >= 1 && num <= 20){
//            for (long i = 1; i<= num; i++){
//                result *= i;
//            }
//            System.out.printf("%d! is %d",num,result);
//            return result;
//        } else {
//            System.out.print("Enter a number between 1 and 20: ");
//            long userNum = input.nextLong();
//            return factorial(userNum);
//        }

        // Using Recursion
        if (num >= 1 && num <= 20){
            return (num * (factorial(num - 1)));
        } else if (num != 0){
            System.out.print("Please enter a number between 0 and 20: ");
            long userNum = input.nextLong();
            return factorial(userNum);
        } else {
            return 1;
        }

    }

    public static String diceRoll(int num1){
        Scanner input = new Scanner(System.in);

        System.out.println("Ready to roll the dice? [y/n] "); // Confirm they are ready to roll
        String readyToRoll = input.nextLine(); // Set user input to variable

        if (!readyToRoll.equalsIgnoreCase("y")){ // If they choose anything beside "y"
            System.out.println("Did you need more time or do you want different dice [d]?"); // Ask if they want to select a different num or more time
            String whyWait = input.nextLine(); // Store input to variable
            if (whyWait.equalsIgnoreCase("d")){ // If user wants to chose new dice
                System.out.print("Please select your desired dice size.\n Size of Dice: "); // Ask them to enter new value for dice
                return diceRoll( parseInt( input.nextLine()));// Use new value in function
            } else {// If user wants more time
                System.out.println("Roll when ready"); // Inform user to roll when ready
                return diceRoll(num1);// Start function over
            }

        } else {// If they are ready to roll
            int die1 = (int) Math.floor(Math.random()* num1)+1;
            int die2 = (int) Math.floor(Math.random()* num1)+1;
            int total = die1 + die2;
            return "*Throws dice*\n *Die 1 shows:" + die1 + "\n *Die 2 shows: " + die2 + "*\n " + total + "!";
        }
    }

    public static void main(String[] args){
//        System.out.printf("%d plus %d is %d\n",5,10,addNums(5,10));
//        System.out.printf("%d subtracted %d is %d\n",10,5,subtractNums(10,5));
//        System.out.printf("%d divided %d is %d\n",10,5,divideNums(10,5));
//        System.out.printf("%d times %d is %d\n",5,10,multiplyNums(5,10));
//        System.out.printf("%d modulus %d is %d\n",10,5,modulusNum(10,5));
//        getInteger(1,10);
//        factorial(20);
//        System.out.print(factorial(20));
        System.out.print(diceRoll(6));

    }

}
