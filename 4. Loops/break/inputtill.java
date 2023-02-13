//Keep printing till user enters multiple of 10
import java.util.*;

public class inputtill {
    public static void main(String[] args) {
        Scanner sy= new Scanner(System.in);
        
        do{
            System.out.println("Enter the number");
            int n = sy.nextInt();
            
            if(n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while(true);
    }
}
