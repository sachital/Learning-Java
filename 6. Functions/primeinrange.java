import java.util.*;

public class primeinrange {

    public static boolean isPrime(int n){ //Helper function 
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
    
    public static void primerange(int i, int n){
        
        for(;i<=n;i++){
            if(isPrime(i)){//if true
                System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    
    public static void main(String args[]){
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sy.nextInt();
        System.out.println("Enter the range");
        int n = sy.nextInt();
        primerange(i,n);
        
    }
    
}
