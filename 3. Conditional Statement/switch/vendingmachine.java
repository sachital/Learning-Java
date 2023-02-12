import java.util.*;
public class vendingmachine{
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Type 1 for Cola");
        System.out.println("Type 2 for Candies");
        System.out.println("Type 3 for Chips");
        System.out.println("Type 4 for Namkeen");
        System.out.println("Enter your choice");
        int choice = sy.nextInt();
        
        switch (choice) {
            case 1:System.out.println("Cola");
                break;
            case 2: System.out.println("Candies");
                break;
            case 3:System.out.println("Chips");
                break;
            case 4:System.out.println("Namkeen");
                break;
            default:System.out.println("Invalid Entry");
                break;
        }
    }
}