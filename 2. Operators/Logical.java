public class Logical {
    public static void main(String[] args) {
    //&&(Logical AND): Based on AND Logic Gate condition; True Only when all statement are true.
        System.out.println((3>1)&&(5>4));
        System.out.println((3>1)&&(5<4));
        System.out.println((3<1)&&(5>4));
        System.out.println((3<1)&&(5<4));
    //||(Logical OR) : Based on OR Logic Gate condition; false Only when all statement are false.
        System.out.println((3>1)||(5>4));
        System.out.println((3>1)||(5<4));
        System.out.println((3<1)||(5>4));
        System.out.println((3<1)||(5<4));
    //* ! (Logical NOT): Based on NOT Logic Gate condition; makes false condition true and true to false.
    //Only one statement is required (minimun)
        System.out.println(!(3>1));
        System.out.println(!(3<1));
    }
}
