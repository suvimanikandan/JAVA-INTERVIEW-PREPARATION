
//Write a program to print whether a number is even or odd,
// also take input from the user.
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        n=input.nextInt();
        if(n%2==0)
        {
            System.out.println("The Number is Even");

        }
        else {
            System.out.println("The number is odd");
        }
    }

}
