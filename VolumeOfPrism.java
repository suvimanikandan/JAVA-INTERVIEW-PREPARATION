import java.util.Scanner;

public class VolumeOfPrism {
        public static void main(String[] args) {
            double base,height,area;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the base value:");
            base=input.nextDouble();
            System.out.println("Enter the height value:");
            height=input.nextDouble();
           area=base*height;
            System.out.println("volume of prism" + area);
        }
    }

