import java.util.*;

public class rotatedhhalfoyramid {

    public static void rotatedhpy(int n){

        for( int i=1; i<=n;i++){

            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the rows");
        int x = sy.nextInt();

        rotatedhpy(x);
    }    
}
