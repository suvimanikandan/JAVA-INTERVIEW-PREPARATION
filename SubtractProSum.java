package Assignment2;

import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer
public class SubtractProSum {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int sum,pro,value,sub,n;

        sum=0;
        pro=1;
        n =input.nextInt();
        while(n>0){
            value=n%10;
            sum=sum+value;
            pro=pro*value;
            n=n/10;
        }
        System.out.println("the sum is "+sum);
        System.out.println("Multiple is "+pro);
            sub=pro-sum;
            System.out.println("sub is:"+sub);
        }
    }

