import java.util.*;
// Print the Half numbered pyramid
public class numberhalfpyramid {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int line = sy.nextInt();

        System.out.println("The output is");
        for ( int i=1; i<=line;i++){
            for(int n=1;n<=i;n++){
                System.out.print(n);
            }
            System.out.println();
            
        }
    }
} 
