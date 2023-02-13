import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sy.nextInt();

        boolean isPrime = true;

        if(n==2){
            System.out.println(n + " : is Prime");
        }else{
            for(int i=2; i<=Math.sqrt(n);i++){
            
                if(n % i==0){//n is multiple of i (i is not equal to 1 & n
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println(n + " : is Prime");
            }else { 
                System.out.println(n + " : is not Prime");
            }

        }
        
    }
}
