import java.util.*;

public class hollowrect {
    public static void hollow(int trow, int tcol){

        for (int i=1;i<=trow;i++){ // outer loop

            for(int j=1;j<=tcol;j++){ //inner loop
                //cell -(i,j)

                if(i==1 || i==trow || j==1 || j==tcol){
                    //boundary cells

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter the rows");
        int x = sy.nextInt();
        System.out.println("Enter the columns");
        int y = sy.nextInt();
        hollow(x, y);
    }
}