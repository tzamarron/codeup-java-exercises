package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
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

    public String getGrades(){
        String allGrades = "";
        for (Integer grade : grades){
            allGrades += grade + " ";
        }
        return allGrades;
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
