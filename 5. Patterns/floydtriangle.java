import java.util.*;
//print floyd's traingle numerical pattern

public class floydtriangle{
    public static void main(String[] args) {
        Scanner sy= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n= sy.nextInt();

        int num =1;
        for( int i = 1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+num);
                num++;
            }
            System.out.println();
        }
    }
}