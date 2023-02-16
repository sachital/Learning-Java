//BINOMIAL COEFFICIENT

public class BinCoeff {
    public static int fact(int n){// factorial fuction
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }

    public static int BinomialCoefficient(int n, int r){
        int a= fact(n);
        int b= fact(r);
        int nmr= fact(n-r);
        
        int BC = a/(b*(nmr));
        return BC;
    }
    public static void main(String[] args) {
        System.out.println(BinomialCoefficient(5,2));
    }
}
