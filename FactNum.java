package Assignments4;

import java.util.Scanner;

public class FactNum {
    public static void main(String[] args) {
        int i,fact=1;
       // int number=5;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter number:");
       int number=input.nextInt();
        for(i=1;i<number;i++){
            fact=fact*i;
        }

        System.out.println("Factorial of" +number+ "is " +fact);

  
    
}
}
