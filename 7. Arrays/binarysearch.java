import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        int numbers[]={2,4,6,8,10,12,14,16,18,20,22};
        System.out.println("Enter the value of Key");
        int key=sy.nextInt();

        System.out.println("Index of the number is "+ binrysrch(numbers, key));
        
    }

    public static int binrysrch(int numbers[], int key){
        int start = 0, end =numbers.length-1;

        while(start<=end){
            int mid= (start+end)/2;

            if(numbers[mid]==key){//value found at mid index
                return mid;
            }

            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        
        return -1;//not found
    }
}
