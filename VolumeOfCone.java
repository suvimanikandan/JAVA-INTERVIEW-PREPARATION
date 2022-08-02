import java.util.Scanner;

public class VolumeOfCone {
        public static void main(String[] args) {
            double radius,height,volume;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the width:");
            radius= input.nextDouble();
            System.out.println("Enter the height:");
            height=input.nextDouble();
            // formula =pie*r^2*h/3
            volume=3.14*radius*radius*height/3;
            System.out.println("The volume of cone is "+volume);
        }
    }


