import java.util.Scanner;

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

    public static void main(String[] args){
//        System.out.printf("%d plus %d is %d\n",5,10,addNums(5,10));
//        System.out.printf("%d subtracted %d is %d\n",10,5,subtractNums(10,5));
//        System.out.printf("%d divided %d is %d\n",10,5,divideNums(10,5));
//        System.out.printf("%d times %d is %d\n",5,10,multiplyNums(5,10));
//        System.out.printf("%d modulus %d is %d\n",10,5,modulusNum(10,5));
//        getInteger(1,10);
//        factorial(20);
//        System.out.print(factorial(21));

    }




}
