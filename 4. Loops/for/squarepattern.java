// user input square pattern having equal number of rows as well as columns
import java.util.*;

public class squarepattern {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sy.nextInt();
        for(int i=1;i<=n;i++){//  for loop used for number of rows
            for (int c = 0;c<n;c++){//another for loop for columns  
                System.out.print("* ");
            }
            System.out.println();// for getting output at regular loop intervals.
        }    
    }
}
