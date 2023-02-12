import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = sy.nextInt();
        System.out.println("Enter the second number");
        int second = sy.nextInt();
        System.out.println("Enter the operator");
        char operator = sy.next().charAt(0);

        switch(operator){
            case '+':System.out.println(first+second);
                    break;
            case '-':System.out.println(first-second);
                    break;
            case '*':System.out.println(first*second);
                    break;
            case '/':System.out.println(first/second);
                    break;
            case '%':System.out.println(first%second);
                    break;
            default :System.out.println("Invalid Entry");
        }
    }
}
