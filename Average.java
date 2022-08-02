package Assignment3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Total no of count of number to find average: ");
        int num=sc.nextInt();
        int sum=0;
        System.out.println("Enter three numbers:");
        for(int i=0;i<num;i++)
            sum=sum+(sc.nextInt());
        double average=sum/(double)num;
        System.out.println("Average of n number is:"+average);

    }
}
