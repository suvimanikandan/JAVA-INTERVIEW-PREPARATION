package Assignment2;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int num=20;
        System.out.println("Factor is "+num );
        for(int i=1;i<num;i++){
            if(num%i==0)
                System.out.println(i + " ");
        }
    }

    }
