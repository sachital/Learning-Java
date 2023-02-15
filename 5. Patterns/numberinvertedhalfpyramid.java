import java.util.*;
// Print the Half numbered pyramid
public class numberinvertedhalfpyramid {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int line = sy.nextInt();

        System.out.println("The output is");
        for ( int i=1; i<=line;i++){
            for(int n=1;n<=line-i+1;n++){
                System.out.print(n);
            }
            System.out.println();
            
        }
    }
} 
