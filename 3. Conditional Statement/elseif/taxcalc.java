import java.util.*;;
public class taxcalc {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the income");
        int income = sy.nextInt();

        if(income<500000){
            System.out.println(income+("tax is "+ income*0));
        } else if( income>500000 && income<1000000){
            System.out.println("tax is "+income*0.2);
        }else{
            System.out.println("tax is "+income*0.3);
        }
    }
}
