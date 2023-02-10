package practice;
import java.util.*;

//making bill on user input using float
public class billing {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the price of pen");
        float pen = sy.nextFloat();
        System.out.println("Enter the price of notebook");
        float notebook = sy.nextFloat();
        System.out.println("Enter the price of textbook");
        float textbook = sy.nextFloat();
        float total = pen + notebook + textbook;
        float taxt = total+(.18f*total);
        System.out.println(taxt);
    }
}
