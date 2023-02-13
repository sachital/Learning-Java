import java.util.*;
public class sumofn {
    public static void main(String[] args) {
        Scanner sy= new Scanner(System.in);
        System.out.println("Enter the the range:n");
        int n = sy.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("sum is "+ sum);
    }
}
