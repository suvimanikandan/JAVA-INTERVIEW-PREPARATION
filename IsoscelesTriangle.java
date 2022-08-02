import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the same side triangle");
        double a=input.nextDouble();
        System.out.println("Enter the side 2 triangle");
        double b=input.nextDouble();

        double  area=(b/4)*Math.sqrt((4*a*a)-(b*b));
        System.out.println("Area of the IsoscelesTriangle"+area);
    }
}
