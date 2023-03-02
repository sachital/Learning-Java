import java.util.*;

public class butterfly {
    
    public static void butterflypattern(int n){
        //1st loop
        for (int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
        //2nd loop
        for(int i=n;i>=1;i--){
             //stars
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sy.nextInt();
        butterflypattern(rows);
    }
}
