public class functionoverloading {
    //multiple functions with same name but different paramenters i.e. FUNCTION OVERLOADING
    //based on type of parameters & Number of parameters

    //Function Overloading doesn't depends on return type.
    /*
     * int sum(int a, int b)
     * float sum ( int a, int b)
     * both will give error cause of parameter being same.
     */

    //F.O. USING PARAMETERS

    public static int sum(int a, int b){//function for sum of 2 values
        return a+b;
    } 
    public static int sum(int a, int b, int c){//sum of three values
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,2));
        System.out.println(sum(2,6,9));
    }
}
