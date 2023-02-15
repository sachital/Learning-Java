import java.util.*;

public class tableofn{
    public static void main(String[] args) {
        Scanner sy= new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sy.nextInt();
        for (int i=1;i<=10;i++){
        System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}