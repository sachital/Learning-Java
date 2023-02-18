import java.util.*;

public class prime {
    public static boolean isPrime(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sy.nextInt();
        System.out.println(isPrime(n));
        
    }
    
}
