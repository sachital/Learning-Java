import java.util.*;
// Print the Character pattern
public class characterpattern {
    public static void main(String[] args) {
        Scanner sy= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sy.nextInt();
        char ch='A';

        for ( int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
