import java.util.*;
public class loop{
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the output context");
        String context = sy.nextLine();
        System.out.println("Enter the range");
        int n= sy.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(context+" ");
        }
    }
}