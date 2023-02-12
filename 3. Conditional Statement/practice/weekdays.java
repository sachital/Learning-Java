

//a Java program to input week number (1-7) and print day of week name using switch case
import java.util.*;

public class weekdays {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the day of week");
        int day = sy.nextInt();

        switch(day){
            case 7:System.out.println("Sunday");
                    break;
            case 1:System.out.println("Monday");
                    break;
            case 2:System.out.println("Tuesday");
                    break;
            case 3:System.out.println("Wednesday");
                    break;
            case 4:System.out.println("Thursday");
                    break;
            case 5:System.out.println("Friday");
                    break;
            case 6:System.out.println("Saturday");
                    break;
            default:System.out.println("Invalid day number");
        }
    }    
}
