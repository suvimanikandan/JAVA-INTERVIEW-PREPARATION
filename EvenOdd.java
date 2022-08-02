package Assignments4;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(num%2==0){
            System.out.println("NUMBER IS EVEN");
        }
        else{
            System.out.println("NUMBER IS ODD");
        }
        
    }
    
}
