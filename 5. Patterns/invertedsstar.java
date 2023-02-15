import java.util.*;
// Print the inverted asterisk pattern
public class invertedsstar {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int lines = sy.nextInt();
        
        for(int i=1; i<=lines;i++){
            for (int n=1;n<=(lines-i)+1;n++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
