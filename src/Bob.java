import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        //Storing Variables
        String intro = "Say something to Bob.";
        String yellRes = "Whoa, chill out"; // Bob's response to yelling
        String questionRes = "Sure"; // Bob's response to questions
        String emptyRes = "Fine. Be that way!"; // Bob's response to saying nothing
        String typicalRes = "Whatever."; // Bob's response to everything else not covered
        Scanner input = new Scanner(System.in); // Initialize scanner
        char lastChar; // Variable to store last character

        // Conversation with Bob
            // Intro to Bob
            System.out.println(intro);
            // Store response to variable
            String userResponse = input.nextLine();

            // Determine Bob's response
            // If you say nothing
            if (userResponse.isBlank()) {
                System.out.println(emptyRes);
                // If yelling at Bob
            } else if ( // set last character
                    (lastChar = userResponse.charAt((userResponse.length() - 1))) == '!')
            { // set last character in if statement
                System.out.println(yellRes);
                // If questioning Bob
            } else if (lastChar == '?') {
                System.out.println(questionRes);
                // If not any of the above
            } else {
                System.out.println(typicalRes);
            }

    }
}
