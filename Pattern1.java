package Assignment6;
/*1. Write a python program to print following star pattern: 
*      *      *      *      *
*      *      *      *      *
*      *      *      *      *
*      *      *      *      *
*      *      *      *      *    */
public class Pattern1 {
    public static void main(String[] args) {
        pattern1(5);
    }

     static void pattern1(int n) {
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
             System.out.print(" * ");
         }
         System.out.println();
    }
    
}
}
