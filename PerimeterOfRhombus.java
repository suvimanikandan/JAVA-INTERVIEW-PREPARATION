import java.util.Scanner;

public class PerimeterOfRhombus {
        public static void main(String[] args) {
            int a,perimeter;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the a value:");
            a=input.nextInt();

            perimeter=4*a;
            System.out.println("perimeter of Rhombus" + perimeter);
        }
    }

