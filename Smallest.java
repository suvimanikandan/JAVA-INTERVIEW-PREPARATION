package Assignments4;

public class Smallest {
    public static int smallest(int first, int second, int third)
    { int min = first;
        if (second < min)
        {
            min = second;
        }
        if (third < min)
        {
            min = third;
        }
        return min;
    }
}



