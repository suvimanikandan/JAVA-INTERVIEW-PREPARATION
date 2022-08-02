package Assignments4;
//Java program to find the Largest and Smallest of three Integers
import java.util.Scanner;

public class Largest{
    public static int main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("ENter three numbers:");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();

        int max= num1;
        if(num2>max){
            System.out.println("num2 is Largest");
        }
        else if(num3>max)
        {
            System.out.println("num2 is greater");
        }
        return max;


    }
}
