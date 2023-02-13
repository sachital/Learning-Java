//reverse of any user input number
import java.util.*;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class reverse {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sy.nextInt();
        while (n>0){
            int last = n%10;
            System.out.print(last);
            n/=10;        
        }
        System.out.println();
    }
}
