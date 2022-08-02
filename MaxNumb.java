//5.Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class MaxNumb {
    public static void main(String[] args) {
        int a,b,max;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter A value:");
        a=input.nextInt();
        System.out.println("Enter B value:");
        b=input.nextInt();
        if(a>b){
            System.out.println("A is Maximum num");
        }
        else
            System.out.println(" B is maximum number");


    }
}
