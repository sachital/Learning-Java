import java.security.DrbgParameters.NextBytes;
import java.util.*;

public class rhombus {
    public static void main(String[] args) {
        Scanner sy= new Scanner(System.in);
        System.out.println("Enter the row number");
        int row = sy.nextInt();
        rhombussol(row);
    }

    public static void rhombussol(int n){
        for ( int i=1; i<=n;i++ ){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
