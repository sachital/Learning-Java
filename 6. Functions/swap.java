import java.util.*;

public class swap {
/*
    public static void swap(int a, int b){
         // swap
         int c = a;
         a=b;
         b=c;
         System.out.println("a is : "+a);// will give output as the call stack function
         System.out.println("B is : "+b);
    }
    //swap- exchange of values
    public static void main(String[] args) {
        Scanner sy= new Scanner(System.in);
        System.out.println("Enter a");
        int a= sy.nextInt();
        System.out.println("Enter b");
        int b= sy.nextInt();

        swap(a, b);
    }

*/
//CALL BY VALUE: JAVA always call by value: makes a copy of original variable to the function
// Whereas in languages like C++ we use the original values  i.e called as CALL BY REFERENCE.

    public static void swp(int a, int b){
        // swap
        int c = a;
        a=b;
        b=c;
    }
    //swap- exchange of values
    public static void main(String[] args) {
        Scanner sy= new Scanner(System.in);
        System.out.println("Enter a");
        int a= sy.nextInt();
        System.out.println("Enter b");
        int b= sy.nextInt();

        swp(a, b);// call by value; 
        /*calls  a copy of original value from the function and into call stack
        until the function runs after returning to main function the original value remains
        */
        System.out.println("a is : "+a);// will output the original value as input
        System.out.println("B is : "+b);
       
    }
    
}
