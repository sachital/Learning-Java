
public class factorial {
    public static int fact(int n){
        int facto = 1;
        
        for( int i=1;i<=n;i++){
            facto*=i;
        }
        return facto;
    }

    public static void main(String[] args) {
        int a=5;
        int f= fact(a);

        System.out.println(f);
        
        //or
        
        System.out.println(fact(7));
    }
}

