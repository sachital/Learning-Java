import java.util.*;


public class decimaltobinary {
    public static void dectobin(int dnum){
        int pow=0;
        int Num= dnum;
        int binNum=0;
         while(dnum>0){
            int rem = dnum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            dnum/=2;
        }

        System.out.println("Binary form pf "+ Num + " is "+ binNum);
    }
    
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n = sy.nextInt();
        dectobin(n);
    }
}
