import java.util.Scanner;

public class AreaOfRhombus {
        public static void main(String[] args) {
            int d1,d2,area;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the d1 value:");
            d1=input.nextInt();
            System.out.println("Enter the d2 value:");
            d2=input.nextInt();
            area=(d1*d2)/2;
            System.out.println("Area of Rhombus" + area);
        }
    }



