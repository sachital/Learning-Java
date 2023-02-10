package practice;

import java.util.*;

// Area of square
public class area {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the side of the square");
        int side = sy.nextInt();
        int area = side * side;
        System.out.println(area);
    }
}
