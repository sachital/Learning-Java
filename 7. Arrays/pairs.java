public class pairs {
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5,6,7,8,9};
        printpairs(numbers);
        
    }

    public static void printpairs(int number[]){
        int tp=0;
        for (int i=0;i<number.length;i++){
            int curr=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("(" + curr + "," + number[j]+ ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs "+ tp);
    }
}
