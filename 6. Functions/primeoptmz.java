import java.util.*;

public class primeoptmz {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++){
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
