//Keep printing user enteries except multiple of 10
// Be aware the loop output in never ending
import java.util.*;

public class except {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);

        do{
            System.out.println("Enter the number");
            int n = sy.nextInt();

            if(n % 10 ==0){
                continue;
            }
            System.out.println("number was : "+n);
        }while(true);
    }    
}
