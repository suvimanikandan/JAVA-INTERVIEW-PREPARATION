package Assignment6;

/* 4. Write a python code to print following pattern:

                                *
                        *      *
                *      *      *
        *      *      *      *
*      *      *      *      *                       */
public class Pattern4 {
    public static void main(String[] args) {
        pattern4(5);
    }

     static void pattern4(int n) {
         for(int i=1;i<=n;i++){
             for(int j=i;j<=n;j++){
                 System.out.print(" ");
             }
                 for(int j=1;j<=i;j++){
                     System.out.print("*");
                 }
                 System.out.println();
             }

         }
    }
    

