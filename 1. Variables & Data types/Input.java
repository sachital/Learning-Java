//INPUT
import java.util.*;//importing from java library

public class Input {
    public static void main(String[] args) {//psvm  input
        Scanner sy = new Scanner(System.in);// sy can be anything & System.in is the input stream same as System.out is the output stream

        String input = sy.next(); //input string 
        //input is name of the input file it can be anything user specified
        System.out.println(input); // output string only for single word without spaces.
        
        
        /*
        String name = sy.nextLine();//nextline used for input irrespective of space
        i.e lines or paragraph
        System.out.println(name); 

        int number = sy.nextInt();//nextInt is for input of int value
        System.out.println(number);

        float rate = sy.nextFloat();//nextFloat is for input of float value
        System.out.println(rate);

        double amount = sy.nextDouble();//nextDouble is for input of double value
        System.out.println(amount);

        boolean first = sy.nextBoolean();//nextBoolean is for input of boolean
        System.out.println(first);
        
       */
   } 
}
