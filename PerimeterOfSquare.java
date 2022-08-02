import java.util.Scanner;
public class PerimeterOfSquare {
public static void main(String[] args) {

            int a,area,perimeter;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the side of square");
            a= input.nextInt();

            // formula p=4*a
    //area=a^2
    area=a*a;
    System.out.println("The Area of square is "+area);

            perimeter=4*a;
            System.out.println("The perimeter of square is "+perimeter);
        }
    }
