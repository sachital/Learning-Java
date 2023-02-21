import java.util.*;

public class iseven {

    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }    
    public static void main(String[] args) {
    Scanner sy = new Scanner(System.in);

    System.out.println("Enter the Integer");
    int num = sy.nextInt();

    if(isEven(num)){
        System.out.println("Number is even");
    }else{
        System.out.println("Number is odd");
        }
    }
    
}
