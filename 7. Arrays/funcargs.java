//arrays are always call by reference 
public class funcargs {
    public static void update(int marks[],int value){

        value = 10;//call by value
        for(int i=0;i< marks.length;i++){
            marks[i]= marks[i]+1;
        }
    } 
    public static void main(String[] args) {
        int marks[]= {87,97,96};
        int value = 5;// call by value
        update(marks,value);
        System.out.println(value);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

    }
}
