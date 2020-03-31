package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

        // Creates a List of all keys in the student HashMap
        List<String> l = new ArrayList<String>(students.keySet());

        do {
            // Greeting
            System.out.println(greeting());

            // List options
            int counter = 3;
            System.out.println("\t0 - View Realm Average");
            System.out.println("\t1 - View past event points for all guilds");
            System.out.println("\t2 - View info for all guilds");
            for(int i = 0; i < l.size(); i++){
                System.out.printf("\t%d - View info for %s guild\n",counter,l.get(i));
                counter++;
            };

            // Asks user what guild to get info on and records response
            int userInquires = test.getInt(0,counter-1,"What would you like to see?\n> ");

            // Buffer
//            System.out.println("");

            // Show information depending on input
            switch(userInquires){
                case 0:
                    // Display overall average
                    overallAvg(students,l);
                    break;
                case 1:
                    // Display all points for each guild
                    allPoints(students,l);
                    break;
                case 2:
                    // Display csv report for all
                    csvReport(students,l);
                    break;
                default:
                    guildInfo(userInquires,students,l);
                    break;
            }


            // Ask user if they want to continue and set boolean value to boolean variable
            // will determine if loop continues or stops
            toContinue = test.yesNo("Would you like to see more?\n> ");

        } while (toContinue);
    }

    public static String greeting(){
        return "\nWelcome to Azeroth!\n\n" +
                "What would you like to do : \n";
    }

    public static void guildInfo(int num, HashMap<String, Student> hashmap, List<String> list){
        int usableNum = num - 3;
        String guild = list.get(usableNum);
        System.out.printf("\tGuild : %s\n" +
                "\tGuild Leader : %s\n" +
                "\tGuild past event points : %s\n"  +
                "\tGuild Average : %.2f\n\n",guild,hashmap.get(guild).getName(),hashmap.get(guild).getGrades(),hashmap.get(guild).getGradeAverage());
    }

    public static void overallAvg(HashMap<String, Student> hashmap, List<String> list){
        double total = 0;
        for (String s : list) {
            total += hashmap.get(s).getGradeAverage();
        }
        System.out.printf("\tRealm Average : %.2f\n",total/list.size());
    }

    public static void allPoints(HashMap<String, Student> hashmap, List<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("\tGuild : %s\n", list.get(i));
            System.out.printf("\tGuild past event points : %s\n\n",hashmap.get(list.get(i)).getGrades());
        }
    }

    public static void csvReport(HashMap<String, Student> hashmap, List<String> list){
        for (int i = 0; i < list.size(); i++){
            String guild = list.get(i);
            System.out.printf("\t%s, %s, %s, %.2f\n",guild,hashmap.get(guild).getName(),hashmap.get(guild).getGrades(),hashmap.get(guild).getGradeAverage());
        }
    }
}
