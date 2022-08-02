package Assignment3;

import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        System.out.println("Enter age:");
        Scanner in=new Scanner(System.in);
        int age=in.nextInt();
    
        if(age>=18)
        {
            System.out.println("YOU ARE ELIGIBLE");
        }
        else{
            System.out.println("YOU ARE NOT ELIGIBLE ");
            
        }

        }
    
}
