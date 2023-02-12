import java.util.*;
public class results {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sy.nextInt();

        String result = (marks>33)?"Pass":"Fail";
        System.out.println("You " + result);
    }
}
