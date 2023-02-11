import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);

        System.out.println("Enter the age");

        int age = sy.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        if(age>13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Underage");
        }
    }
}
