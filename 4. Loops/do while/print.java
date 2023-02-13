//To get output of desired range and context
import java.util.*;

public class print{
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the context");
        String c = sy.nextLine();
        System.out.println("Enter the loop range");
        int n = sy.nextInt();
        int i=0;
        do{
            System.out.print(c+" ");
            i++;
        }while(i<=n);
    }
}