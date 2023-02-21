import java.util.*;

public class palindrome{

public static boolean palin(int num){
    int pnum=num;//to store the num value
    int rev=0;

    while(pnum!=0){
        int rem= pnum % 10;
        rev = rev  * 10 + rem;
        pnum /= 10;
    }
    if (num == rev){
        return true;
    }
    return false;
}

public static void main(String[] args) { 
    Scanner sy = new Scanner(System.in);
    System.out.println("Enter the number");
    int p = sy.nextInt();
    
    if(palin(p)){
        System.out.println("Number : "+ p + " is a palindrome" );
    }else{
        System.out.println("Number : "+ p + " is not a palindrome");
    }
}
}
