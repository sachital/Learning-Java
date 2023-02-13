import java.util.*;
public class numberloop {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
            System.out.println("Enter the number range");
            int number = sy.nextInt();
            int counter = 1;
           while(counter<=number){
            System.out.print(counter+" ");
            counter++;
           }

           System.out.println("Loop Complete");
    }
}
