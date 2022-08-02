package Assignments4;

import java.util.Scanner;

public class TwoIntegerNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1=in.nextInt();
        System.out.println("Enter Second number:");
        int num2=in.nextInt();

        
        sum(num1,num2);

    }

    public static void sum(int num_A, int num_B) {
     int sum = 0;
     sum= num_A+num_B;
System.out.println("The sum of two numbers" +sum);

    }
    
}
