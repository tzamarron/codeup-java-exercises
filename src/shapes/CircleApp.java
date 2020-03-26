package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input(); // Creates instance of Input
        long numberOfCircles = 0; // Set number of circles to 0
        boolean wantsToContinue; // creates boolean

        // a loop that prompts user to define the radius of a newly created circle
        // once defined the number of circles is increased
        // the area and the circumference is shown for the circle
        // user is then prompted if they wish to create another circle
        // If yes then loop is repeated, if no then loop is ended
        do {
            System.out.print("What is the radius of your circle?\nRadius: ");
            Circle newCircle = new Circle(input.getDouble());
            numberOfCircles++;

            System.out.printf("\nThe area of your circle is %f.\nThe circumference of your circle is %f.\n", newCircle.getArea(), newCircle.getCircumference());

            wantsToContinue = input.yesNo("Do you want to create another circle? [y/n]");
        } while (wantsToContinue);

        // After loop has ended total number of circles is shown
        System.out.print(numberOfCircles + " circle(s) was created.");
    }
}
