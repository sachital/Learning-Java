import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
           System.out.println("Enter the content of loop");
           String content = sy.nextLine();
            System.out.println("Enter the number of times for loop to run");
            int number = sy.nextInt();
            int counter = 0;
           while(counter<number){
            System.out.print(content);
            counter++;
           }

           System.out.println("Loop Complete");
    }
}
