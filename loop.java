package Assignment2;

import java.util.Scanner;

//Take integer inputs till the user enters 0
// and print the sum of all numbers (HINT: while loop)
public class loop {
    public static void main(String[] args) {
        System.out.println("Enter num: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int sum = 0;
        while(num!=0) {
            sum = sum + num;
        }
        System.out.println(num);
        }
    }

