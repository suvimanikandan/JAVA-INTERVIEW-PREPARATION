import java.sql.SQLOutput;
import java.util.Scanner;
public class CurvedSurfaceOfAreaCylinder {
        public static void main(String args[])
        {
            float r, h, surfacearea;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter R value:");
            r=input.nextFloat();
            System.out.println("Enter H value:");
            h=input.nextFloat();
            surfacearea = (22*r*(r+h))/7;
            System.out.println(" Curved  Surface Area of Cylinder is: "+surfacearea);
        }
    }


