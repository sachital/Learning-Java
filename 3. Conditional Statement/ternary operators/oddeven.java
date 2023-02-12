import java.util.*;
public class ternary{
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sy.nextInt();

        String type = ((number%2)==0)?"even":"odd";
        System.out.println(type);
    }
}