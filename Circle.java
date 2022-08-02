package Assignments4;

import java.util.Scanner;


public class Circle {
    public static void main(String[] args) {
        int radius;
        double area;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number:");
        radius=in.nextInt();
         area=3.14*radius*radius;
        System.out.println("The AREA OF CIRCLE IS"+area);


    }
    
}
