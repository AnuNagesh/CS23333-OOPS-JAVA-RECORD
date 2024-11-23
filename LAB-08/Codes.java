CODE-1:
PROGRAM:
Write a program to create base class Shape.
CODE:
import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double circleRadius = scanner.nextDouble();
        double rectangleLength = scanner.nextDouble();
        double rectangleBreadth = scanner.nextDouble();
        double triangleBase = scanner.nextDouble();
        double triangleHeight = scanner.nextDouble();

        Circle circle = new Circle(circleRadius);
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleBreadth);
        Triangle triangle = new Triangle(triangleBase, triangleHeight);

        System.out.printf("Area of a circle: %.2f%n", circle.calculateArea());
        System.out.printf("Area of a Rectangle: %.2f%n", rectangle.calculateArea());
        System.out.printf("Area of a Triangle: %.2f%n", triangle.calculateArea());

        scanner.close();
    }
}

CODE-2:
PROGRAM:
Implementation of final.
CODE:
class FinalExample {

    private final int maxSpeed = 120; // Final variable

    public void displayMaxSpeed() {
        System.out.println("The maximum speed is: " + maxSpeed + " km/h");
    }
}

class Subclass extends FinalExample {
    // public void displayMaxSpeed() { // This would cause a compilation error
    //     System.out.println("Cannot override a final method");
    // }

    public void showDetails() {
        System.out.println("This is a subclass of FinalExample.");
    }
}

public class Prog {
    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        obj.displayMaxSpeed();

        Subclass subobj = new Subclass();
        subobj.showDetails();
    }
}

CODE-3:

  PROGRAM:
Write a program to extract string.
CODE:
import java.util.Scanner;

public class VowelExtraction {
    public static String extractStrings(String[] strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            if (isVowel(str.charAt(0)) && isVowel(str.charAt(str.length() - 1))) {
                result.append(str);
            }
        }
        return result.toString().toLowerCase();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        String result = extractStrings(strings);
        if (result.isEmpty()) {
            System.out.println("no matches found");
        } else {
            System.out.println(result);
        }
    }
}
  
