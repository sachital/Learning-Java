import java.util.*;

public class Relational {
    public static void main(String[] args) {
        Scanner sy= new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sy.nextInt();
        System.out.println("Enter value of b");
        int b = sy.nextInt();
        //==: to check whether values are equal 
        System.out.println(a==b);//gives output in boolean terms i.e: True/false;
        
        //!=: to check whether values are not equal
        System.out.println(a!=b);//gives output in boolean terms i.e: True/false;
        
        //>: checks greater than
        System.out.println(a>b);//gives output in boolean terms i.e: True/false;
        
        //<: checks less than
        System.out.println(a<b);//gives output in boolean terms i.e: True/false;
        
        //>=: Greater than equal to
        System.out.println(a>=b);//gives output in boolean terms i.e: True/false;
        
        //<=: Less than equal to  
        System.out.println(a<=b);//gives output in boolean terms i.e: True/false;
    }    
}
