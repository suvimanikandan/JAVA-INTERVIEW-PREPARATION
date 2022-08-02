package Assignments4;

import java.util.Scanner;

public class SumOfTwoMultiplyNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1=in.nextInt();
        System.out.println("Enter second number:");
        int num2=in.nextInt();
        product(num1,num2);
    }

    public static void product(int num1, int num2) {
        int product=0;
      product=num1*num2;
      System.out.println("PRODUCT OF TWO NUMBER IS:"+product);
    }
}
