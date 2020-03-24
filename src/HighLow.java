import java.util.Scanner;

public class HighLow {

    public static String guessIt(int user, int comp){
        Scanner input = new Scanner(System.in);
        if (user < comp){
            System.out.print("Higher!\n Your Guess: ");
            return guessIt(input.nextInt(),comp);
        } else if (user > comp){
            System.out.print("Lower!\n Your Guess: ");
            return guessIt(input.nextInt(),comp);
        } else {
            return "Good Guess!";
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//                If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"

        int compNumber = (int) Math.floor(Math.random() * 101);
        System.out.println(compNumber);
        System.out.println("Welcome to my Guessing Game!\n I am thinking of a number between 1 and 100. Can you guess what it is?\n Your Guess: ");
        int userGuess = input.nextInt();
        System.out.print(guessIt(userGuess,compNumber));


    }
}
