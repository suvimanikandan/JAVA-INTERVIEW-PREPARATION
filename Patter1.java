package Assignment5;


public class Patter1 {
    public static void main(String[] args) {
        pattern1(5);
    }

        static void pattern1(int n) {
            for (int row = 1; row <= n; row++) {
                // for every row, run the col
                for (int col = 1; col <= n; col++) {
                    System.out.print("* ");
                }
                // when one row is printed, we need to add a newline
                System.out.println();
            }
        }
    }

