public class subarrays {
    public static void main(String[] args) {
        int number[]= {1,2,3,4,5,6,7,8,9};
        sbarrays(number);
    }
    
    public static void sbarrays(int numbers[]){
        for(int i= 0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<j;k++){// only for print
                    System.out.print(+ numbers[k]+"");
                }
                System.out.println();
            }
            
            System.out.println();
        }
        
    }
}
