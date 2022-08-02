
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int width,height,area;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the width:");
        width= input.nextInt();
        System.out.println("Enter the height:");
        height=input.nextInt();
        // formula A= W x H
        area=width*height;
        System.out.println("The Area of rectangle is "+area);
    }
}
