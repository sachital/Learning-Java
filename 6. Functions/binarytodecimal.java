import java.util.*;
public class binarytodecimal {

    public static void bnrytodeci(int bnum){
        int num=bnum;//to store the bnum value
        int pow=0;
        int dec=0;

        while(bnum>0){
            int LastD= bnum%10;
            dec = dec+(LastD*(int)Math.pow(2,pow));
            pow++;
            bnum=bnum/10;
        }
        System.out.println("decimal of "+num+" is "+dec);
    }

    public static void main(String[] args) { 
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int n = sy.nextInt();
        bnrytodeci(n);
    }
}
