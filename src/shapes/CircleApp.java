package shapes;

import util.Input;



public class CircleApp {

    public static void main(String[] args){
        Input input = new Input();
        long numberOfCircles = 0;
        boolean wantsToContinue;
        do {
            System.out.print("What is the radius of your circle?\nRadius: ");
            Circle newCircle = new Circle(input.getDouble());
            numberOfCircles++;

            System.out.printf("\nThe area of your circle is %f.\nThe circumference of your circle is %f.\n", newCircle.getArea(), newCircle.getCircumference());

            wantsToContinue = input.yesNo("Do you want to create another circle? [y/n]");
        } while(wantsToContinue);
        System.out.print(numberOfCircles + " circle(s) was created.");
    }
}
