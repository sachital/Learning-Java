package ifelse;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class oddeven {
    public static void main(String[] args) {
    Scanner sy = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sy.nextInt();
    if(n%2==0){
        System.out.println(n+" is even");
    }else{
        System.out.println(n +" is odd");
    }
    }
}
