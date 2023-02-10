public class Arithmetic {
    public static void main(String[] args) {
        //Binary Operators
        int a = 10;
        int b = 5;
        
        System.out.println("Sum is:"+ (a+b));
        System.out.println("Difference is:"+ (a-b));
        System.out.println("Multiple is:"+ (a*b));
        System.out.println("Division is:"+ (a/b));
        System.out.println("Modulo(Remainder) is:"+ (a%b));

        //Unary (Needs single operands)
        /*
        Increment operator
        ++ > a= a+1; a++,++a
        
            Pre-increment
            i.e ++a 
            value changes first then we use the value
        */

            int c = ++a;
                System.out.println(a);
                System.out.println(c);

        /*
            Post-increment
            i.e a++
            value use first then we change the value
        */

            int d = a++;
                System.out.println(a);
                System.out.println(d);

        /*
        Decrement operator
        -- > a= a-1; a--,--a
            Pre-decrement
            i.e --a 
            value changes first then we use the value
        */

            int e = --a;
                System.out.println(a);
                System.out.println(e);
        
        /*
            Post-decrement
            i.e a--
            value use first then we change the value
            */
        
            int f = a--;
                System.out.println(a);
                System.out.println(f);
            
    }
}
