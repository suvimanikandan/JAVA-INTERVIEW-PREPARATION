import java.util.Scanner;

public class VolumeOfCylinder {
        public static void main(String[] args) {
            double radius, height, volume;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the width:");
            radius = input.nextDouble();
            System.out.println("Enter the height:");
            height = input.nextDouble();
            // formula =pie*r^2*h
            volume = 3.14 * radius * radius * height ;
            System.out.println("The volume of cylinder is " + volume);
        }
    }


