import java.util.*;
public class greater {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        
        System.out.println("Enter the first number");
        int a = sy.nextInt();
        System.out.println("Enter the second number");
        int b = sy.nextInt();

        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else{
            System.out.println(b+" is larger than "+a);
        }
    }
}
