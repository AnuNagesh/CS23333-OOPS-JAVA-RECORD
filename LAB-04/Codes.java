CODE-1:

PROGRAM:
Write a program to invoke different constructors.
CODE:
public class Student {
    private String name;
    private int rollno;
    public Student() {
        System.out.println("No-arg constructor is invoked");
        this.name = null;
        this.rollno = 0;
    }
    public Student(String name) {
        System.out.println("1 arg constructor is invoked");
        this.name = name;
        this.rollno = 0;
    }
    public Student(String name, int rollno) {
        System.out.println("2 arg constructor is invoked");
        this.name = name;
        this.rollno = rollno;
    }
    public void display() {
        System.out.println("Name =" + this.name + " , Roll no = " + this.rollno);
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Rajalakshmi");
        Student student3 = new Student("Lakshmi", 101);
        student1.display();
        student2.display();
        student3.display();
    }
}

CODE-2:

PROGRAM:
Write a program to create class mobile.
CODE:
public class Mobile {
    private String manufacturer;
    private String operating_system;
    public String color;
    private int cost;

    public Mobile(String manufacturer, String operating_system, String color, int cost) {
        this.manufacturer = manufacturer;
        this.operating_system = operating_system;
        this.color = color;
        this.cost = cost;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setOperatingSystem(String operating_system) {
        this.operating_system = operating_system;
    }

    public String getOperatingSystem() {
        return operating_system;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
     return cost;
    }

    @Override
    public String toString() {
        return "manufacturer = " + manufacturer + "\n" +
               "operating_system = " + operating_system + "\n" +
               "color = " + color + "\n" +
               "cost = " + cost;
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile("Redmi", "Andriod", "Blue", 34000);
        System.out.println(mobile.toString());
    }
}

CODE-3:

PROGRAM:
Using class calculate area and circumference.
CODE:
import java.util.Scanner;
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Area = " + String.format("%.2f", calculateArea()) + "\n" +
               "Circumference = " + String.format("%.2f", calculateCircumference());
    }

    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        int d=A.nextInt();
        Circle circle = new Circle(d);

        System.out.println(circle.toString());
    }
}
