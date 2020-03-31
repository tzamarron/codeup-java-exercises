package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String,String> attendance;
    Input test = new Input();

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
        this.attendance = new HashMap<String,String>();
    };

    // returns the student's name
    public String getName(){
        return name;
    };

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };

    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    };

    // returns all the grades for the student
    public String getGrades(){
        String allGrades = "";
        for (Integer grade : grades){
            allGrades += grade + " ";
        }
        return allGrades;
    }

    // adds to Student's attendance
    // Confirms value is either a "p" or "a"
    public void recordAttendance(String date, String value){
        if (value.toLowerCase().startsWith("p")){
            attendance.put(date, "P");
        } else if ( value.toLowerCase().startsWith("a")){
            attendance.put(date,"A");
        } else {
            String newValue = test.getString("Please enter a [P] - present or [A] - absent.\n> ");
            recordAttendance(date,newValue);
        }
    }

    // Adds up present days and return Student's attendance
    public double attendancePercent(){
        int presentDays = 0;
        List<String> dates = new ArrayList<String>(attendance.keySet());
        // Cycles thru student's attendance looking for days they were present
        // and tallies them up
        for (int i =0; i < attendance.size(); i++){
            if (attendance.get(dates.get(i)).equals("P")){
                presentDays++;
            }
        }
        // Returns total present days divided by total days (average)
        return (double)presentDays/attendance.size();
    }

    // Finds days Student was absent on and return them
    public List<String> daysAbsent(){
        List<String> absentOn = new ArrayList<String>();
        List<String> dates = new ArrayList<String>(attendance.keySet()); // List of dates
        // Cycles thru student attendance looking for absent days
        // adds the date to ArrayList
        for (int i = 0; i < attendance.size(); i++){
            if (attendance.get(dates.get(i)).equals("A")){
                absentOn.add(dates.get(i));
            }
        }
        return absentOn;
    }

    public static void main(String[] args) {
        Student firstEnrolled = new Student("Una");

        firstEnrolled.addGrade(100);
        firstEnrolled.addGrade(95);
        firstEnrolled.addGrade(99);
        firstEnrolled.addGrade(100);

        System.out.println(firstEnrolled.getGradeAverage());
    }
}
