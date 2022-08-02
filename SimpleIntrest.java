//3
// Write a program to input principal, time, and rate (P, T, R)
// from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        float p,r,t,si;//principal amount of interest rate respectively

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value of p:");
         p =input.nextFloat();
        System.out.println("Enter a value of r:");
        r=input.nextFloat();
        System.out.println("Enter a value of t:");
        t=input.nextFloat();

        si=(p*r*t)/100;  //simple interest
        System.out.println("Simple interest is"+si);


    }
}
