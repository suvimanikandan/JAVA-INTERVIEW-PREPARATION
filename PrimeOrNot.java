package Assignments4;

public class PrimeOrNot{
   static boolean isPrime(int n){
       if (n<=1)
           return false;
           //ccheck 2 to n-1
           for(int i=2;i<n;i++)
           if(n%i==0)
           return false;

           return true;
   }
   public static void main(String[]args)
   {
       if(isPrime(11))
       System.out.println("true");
       else
       System.out.println("false");
       if(isPrime(15))
       System.out.println("True");
       else
       System.out.println("False");
   }
   }
    