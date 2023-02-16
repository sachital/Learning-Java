import java.util.*;

public class parameters {
    public static int add(int p,int q){// parameters & formal parameters
        int c = p+q;
        return c;
    }

    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sy.nextInt();
        System.out.println("Enter the second number");
        int b= sy.nextInt();
        int c= add(a,b);//arguments or actual parameters 
        System.out.println("sum of "+a+" & "+b+" is: "+c);
    }
}
