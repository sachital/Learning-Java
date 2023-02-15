import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sy.nextInt();
        int fact = 1;
        for(int i = 1; i<=n;i++){
            fact*=i;

        }
        System.out.println(fact);
    }            
}
