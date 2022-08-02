package Assignment2;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        int radius;
        double area;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius  Value:");
        radius=input.nextInt();

        area =3.14*radius*radius;
        System.out.println("The area of circle is"+area);
    }
}
