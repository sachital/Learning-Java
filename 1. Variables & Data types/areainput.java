import java.util.*;

public class areainput {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);

        // Area of Circle

        System.out.println("Enter the radius of circle");
        float rad = sy.nextFloat();
        float area = 3.14f*rad*rad;// f is used in float values in java to signify float
        System.out.println(area);
    }
}
