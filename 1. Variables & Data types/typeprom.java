public class typeprom {
    public static void main(String argm[]) {
        /*java automatically promotes each byte, short, or char operand  to int
        when evaluating the expression */
        
        /*0short a = 5;
        byte b = 2;
        char c = 'c';
        byte bt = (byte) (a+b+c);
        System.out.println(bt);
        */ 

        /*if one operand is long, float or double the whole expression is promoted
        to long, float or double respectively. */

        /*int a = 54;
        long b = 5367;
        float c = 81.452f;
        double d = 75;
        int sum = a+b+c+d;
        System.out.println(sum);
        */

        byte b = 11;
        // byte a = b * 3;
        // here b*3 is taken as expression and b type prompted to int 
        // to successfully run into byte we've to type cast/
        byte a = (byte) (b*3);
        System.out.println(a);
    }
}
