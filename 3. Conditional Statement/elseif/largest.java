import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the Ist number");
        int first = sy.nextInt();
        System.out.println("Enter the IInd number");
        int second = sy.nextInt();
        System.out.println("Enter the IIIrd number");
        int third = sy.nextInt();

        if(first>=second && first>=third){
            System.out.println(first + " is largest");
        }else if( second>=third){
            System.out.println(second + " is largest");
        }else{
            System.out.println(third + " is largest");
        }
    }
}
