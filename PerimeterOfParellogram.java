import java.util.Scanner;

public class PerimeterOfParellogram {
        public static void main(String[] args) {
            int base,height,area,perimeter;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the base value:");
            base=input.nextInt();
            System.out.println("Enter the height value:");
            height=input.nextInt();
            area=base*height;
            System.out.println("Area of Parellelogram" + area);
             perimeter=2*(base+height);    //2*(b+h)
            System.out.println("perimeter of Parellelogram" + perimeter);

        }
    }


