import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
        public static void main(String[] args) {
            float a;
            double area,perimeter;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the a value:");
            a=input.nextInt();
            //area= ((1.73 *a* a)/4);
            //System.out.println("Area of EquilateralTriangle" + area);
            perimeter=a+a+a;
            System.out.println("perimeter of EquilateralTriangle" + perimeter);
        }
    }



