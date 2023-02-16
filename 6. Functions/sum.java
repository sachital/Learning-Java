import java.util.*;

public class sum {
    public static void add(){
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sy.nextInt();
        System.out.println("Enter the second number");
        int b= sy.nextInt();
        int c = a+b;
        System.out.println("sum of "+a+" & "+b+" is: "+c);
    }

    public static void main(String[] args) {
        add();
    }
}
