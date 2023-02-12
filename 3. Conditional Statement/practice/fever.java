


//written a code to determine You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
import java.util.*;
public class fever{
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the tempreture");
        double temp = sy.nextDouble();;

        if(temp>100){
            System.out.println("You've fever");
        }else{
            System.out.println("You're healthy");
        }
    }
}