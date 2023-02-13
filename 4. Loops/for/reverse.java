//reverse of any user input number
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sy.nextInt();
        int rev = 0;
        for(;n!=0;n/=10){
            int ld=n%10;
            rev=(rev%10)+ld;
        }
        System.out.println(rev);
    }
}