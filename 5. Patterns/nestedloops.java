import java.util.*;

public class nestedloops {
    public static void main(String[] args) {
        Scanner sy= new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int lines= sy.nextInt();
        for(int i=1;i<=lines;i++){
            for(int n=1;n<=i;n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
            
}  

