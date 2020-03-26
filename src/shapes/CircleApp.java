package shapes;

import util.Input;

import java.util.Scanner;

import static util.Input.setScanner;

public class CircleApp {
    public static void createCircles(){
        System.out.print("What is the radius of your circle?\nRadius: ");
        double yourRadius = scanner.nextDouble();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        setScanner(scanner);
        Input myCircle = new Input();


        Circle test = new Circle(scanner.nextDouble());
        System.out.printf("The area of your circle is %f\nThe circumference of your circle is %f\n\n",test.getArea(),test.getCircumference());
        System.out.print(myCircle.yesNo());
    }
}
