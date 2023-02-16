import java.security.Policy;
import java.util.*;

public class product {

    public static int multiply(int a, int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sy.nextInt();
        System.out.println("Enter b");
        int b = sy.nextInt();
    
        int c= multiply(a, b);

        System.out.println(c);
    }    
}
