import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        int base,height,area;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the base value:");
        base=input.nextInt();
        System.out.println("Enter the height value:");
        height=input.nextInt();
        area=base*height;
        System.out.println("Area of Parellelogram" + area);
    }
}
