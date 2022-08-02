import java.util.Scanner;

public class VolumeOfSphere {
        public static void main(String[] args) {
            int radius;
            double volume, pie=3.14285714286;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the radius value:");
            radius=input.nextInt();
       //formula Volume= (4/3)*pie*r3
            volume=(4/3)*pie*(radius*radius*radius);
            System.out.println("volume of Sphere" +volume);
        }
    }


