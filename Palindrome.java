import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String str, rev="";
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a string:");
        str=input.nextLine();

        int length=str.length();

        for(int i= length-1;i>=0;i--)
            rev=rev+str.charAt(i);

        if(str.equals(rev))
            System.out.println("The String is palindrome");

            else
            System.out.println("The String is not palindrome");



    }
}
