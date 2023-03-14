import java.util.*;

public class largest {
    public static void main(String[] args) {
        int number[]= {1,3,6,4,2,5};
        System.out.println("largest value is "+ findlargest(number));

    }

    public static int findlargest(int number[]){
        int large = Integer.MIN_VALUE;//-infinity
        
        for ( int i = 0; i< number.length;i++){
            if( large <number[i]){
                large= number[i];
            }
        }
        return large;
    }
}
