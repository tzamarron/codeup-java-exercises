import java.util.Formatter;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //Exercise 1 ----- Loop Basic

        // A ---- while loop
//        int i = 5;
//        while (i < 15){
//            System.out.printf("%d ",i);
//            i++;
//        }


        // B -----do while loop
//        int i = 0;
//        do{
//            System.out.printf("%d\n",i);
//            i+=2;
//        } while(i<=100);

//        int i = 100;
//        do{
//            System.out.printf("%d\n",i);
//            i-=5;
//        } while(i >= -10);

//        int i = 2;
//        do{
//            System.out.println(i);
//            i = (int) Math.pow(i, 2);
//        } while(i<=1_000_000);

        // C ---
        // do while #1
//        for (int i = 0;i<=100;i+=2){
//            System.out.printf("%d\n",i);
//        };

        // do while #2
//        for (int i = 100;i >= -10;i -= 5){
//            System.out.printf("%d\n",i);
//        }



        // Exercise 2 ----- FizzBuzz
//        for (int i = 1;i <= 100; i++){
//            if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 5 & 7?
//                System.out.println("fizzbuzz");
//            else if ((i % 3) == 0) // Is it a multiple of 5?
//                System.out.println("fizz");
//            else if ((i % 5) == 0) // Is it a multiple of 7?
//                System.out.println("buzz");
//            else
//                System.out.println(i); // Not a multiple of 5 or 7
//        }



        // Exercise 3 -----Table of powers
        Scanner input = new Scanner(System.in);

//        System.out.print("What number would you like to go up too? ");
//        // Number user picked
//        int userPick = input.nextInt();
//
//        // Top of "Chart"
//        System.out.print("number | squared | cubed\n------ | ------- | -----\n");
//
//        // Setting variables
//        boolean isTrue;
//        String userConfirms;
//
//        // Creates info for table
//        do{
//            for (int i = 1; i <= userPick; i++) {
//                // Variable to square and cube iteration
//                int squared = (int) Math.pow(i, 2);
//                int cubed = (int) Math.pow(i, 3);
//
//                // Prints current iteration
//                System.out.printf("%-6d | %-7d | %-5d\n", i, squared, cubed);
//            }
//            // After loop asks user if they want to continue
//            System.out.print("Do you want to continue? [y/n]");
//
//            // Store user answer as variable
//            userConfirms = input.next();
//
//            // Set variable as true or false based on user selection
//            isTrue = userConfirms.equalsIgnoreCase("y");
//
//            // Increases user number in case of continuation
//            userPick++;
//
//        } while (isTrue);

        // Exercise 4 ----- Grades
        System.out.print("Enter a number grade: ");
        // Sets number to variable
        int userGrade = input.nextInt();

        // Set Variables
        boolean isTrue;
        String userConfirm;

        // Determine Letter Grade
        do{
            if (userGrade >= 94 && userGrade <= 100) {
                System.out.println("A+");
            } else if (userGrade >= 88){
                System.out.println("A-");

            } else if (userGrade >= 84){
                System.out.println("B+");
            } else if (userGrade >= 80) {
                System.out.println("B-");

            } else if (userGrade >= 73){
                System.out.println("C+");
            } else if (userGrade >= 67){
                System.out.println("C-");

            } else if (userGrade >= 63){
                System.out.println("D+");
            } else if (userGrade >= 60){
                System.out.println("D-");

            } else {
                System.out.println('F');
            }
            System.out.print("Do you want to continue? [y/n] ");
            userConfirm = input.next();

            isTrue = userConfirm.equalsIgnoreCase("y");
            if(isTrue) {
                System.out.print("Enter a number grade: ");
                userGrade = input.nextInt();
            }

        } while(isTrue);





    }
}