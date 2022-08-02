import java.util.Scanner;

public class AreaOfTraingle {
    public static void main(String[] args) {
        float Breadth,Height,Area;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Breadth value:");
        Breadth=input.nextInt();
        System.out.println("Enter the Height value:");
        Height=input.nextInt();
        Area=(Breadth*Height)/2;
        System.out.println("Area Of Traingle is "+Area);

    }
}
