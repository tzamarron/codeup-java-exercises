package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        // Create new students and add grades to them
        Student deathKnight = new Student("Crodaed");
        deathKnight.addGrade(100);
        deathKnight.addGrade(100);
        deathKnight.addGrade(85);

        Student mage = new Student("Braindmg");
        mage.addGrade(100);
        mage.addGrade(100);
        mage.addGrade(95);

        Student warlock = new Student("Panic");
        warlock.addGrade(100);
        warlock.addGrade(100);
        warlock.addGrade(90);

        Student hunter = new Student("Nyx");
        hunter.addGrade(100);
        hunter.addGrade(100);
        hunter.addGrade(85);

        // Place username and Student associated to it in hashset students
        students.put("crodaed4LichKing", deathKnight);
        students.put("polymorphEveryone", mage);
        students.put("yourSoulIsNowMine", warlock);
        students.put("misdirect2Healer", hunter);

        // Creates instance for Input and set boolean variable
        Input test = new Input();
        boolean toContinue;

        do {
            // Greeting
            System.out.println("\nWelcome to Azeroth!\n\n" +
                    "Here are some of the top guilds : \n");

            // List guild names
            students.forEach((s, student) -> System.out.printf("\t| %-20s |\n",s));

            // Asks user what guild to get info on and records response
            String userInquires = test.getString("What guild would you like more information on?\n> ");

            // Buffer
            System.out.println("");

            // If input equals a key in hashset display information
            if (students.containsKey(userInquires)){
                System.out.printf("\tGuild : %s\n" +
                        "\tGuild Leader : %s\n" +
                        "\tGuild Raid Points : %d\n" +
                        "\tGuild Battleground Points : %d\n" +
                        "\tGuild Arena Points : %d\n" +
                        "\tGuild Average : %.2f\n\n",userInquires,students.get(userInquires).getName(),students.get(userInquires).getGradeAverage());
                // if input isn't a key in hashset
            } else {
                System.out.println("Sorry, no guild was found by that name.\n");
            }

            // Ask user if they want to continue and set boolean value to boolean variable
            // will determine if loop continues or stops
            toContinue = test.yesNo("Would you like to see another guild?\n> ");

        } while (toContinue);
    }
}
