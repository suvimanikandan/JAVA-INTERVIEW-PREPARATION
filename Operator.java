//4Take in two numbers and an operator (+, -, *, /)
// and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int a, b, sum, sub, mul, div;
        char sign;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  first value:");
        a = input.nextInt();
        System.out.println("Enter the second value:");
        b = input.nextInt();
        System.out.println("Enter the operator:");
         sign = input.next().charAt(0);
        if (sign == '+'){
            sum = a + b;
            System.out.println("The Addition value is:" +sum);
        }

     else if (sign == '-'){
            sub = a -b;
            System.out.println("The subtraction value is:"+sub);
        }
        else if (sign == '*'){
            mul = a *b;
            System.out.println("The Multiplication value is:"+mul);
        }
        else if (sign == '/'){
            div= a /b;
            System.out.println("The division value is:"+div);
        }
        else
            System.out.println("YOu choose wrong operator");
    }
}
