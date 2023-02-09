import java.util.*;

public class productinput {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sy.nextInt();
        
        System.out.println("Enter the second number");
        int b = sy.nextInt();
        
        int product = a*b;
        System.out.println(product);
    }
}
