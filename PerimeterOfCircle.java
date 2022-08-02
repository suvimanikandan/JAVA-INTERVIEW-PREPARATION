import java.util.Scanner;

public class PerimeterOfCircle {
        public static void main(String[] args) {
            double radius;
            double perimeter;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the radius  Value:");
            radius=input.nextDouble();

            perimeter=2*3.14*radius; //2*pi*r
            System.out.println("The perimeter of circle is"+perimeter);
        }
    }


