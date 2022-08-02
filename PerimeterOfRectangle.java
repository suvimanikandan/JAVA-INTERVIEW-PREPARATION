import java.util.Scanner;

public class PerimeterOfRectangle {
        public static void main(String[] args) {
            int width,height,perimeter;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the width:");
            width= input.nextInt();
            System.out.println("Enter the height:");
            height=input.nextInt();
            // 2*(a+b)
            perimeter=2*(width+height);
            System.out.println("The perimeter of rectangle is "+perimeter);
        }
    }

