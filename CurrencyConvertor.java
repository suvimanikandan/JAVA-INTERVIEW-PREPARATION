//6Input currency in rupees and output in USD.
import java.util.Scanner;


public class CurrencyConvertor {
    public static void main(String[] args) {
        float rupees,dollars;
        Scanner input=new Scanner(System.in);
        System.out.println("please Enter a rupees");
        rupees=input.nextFloat();
         dollars=rupees/64;
        System.out.println(dollars+"Dollars");


    }
}
