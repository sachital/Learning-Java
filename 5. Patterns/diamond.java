import java.util.*;

public class diamond {
        public static void main(String[] args) {
            Scanner sy = new Scanner(System.in);
            System.out.println("Enter the rows");
            int x = sy.nextInt();
            diamond_pattern(x);
        }

        public static void diamond_pattern(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }

                for(int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }

                for(int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
