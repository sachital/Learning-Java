package practice;
import java.util.*;

//average of 3 user input nnumbers
public class avrginput {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the first number");
        int A = sy.nextInt();
        System.out.println("Enter the second number");
        int B = sy.nextInt();
        System.out.println("Enter the third number");
        int C = sy.nextInt();
        int avrg = (A+B+C)/3;
        System.out.println(avrg);
    }
}
