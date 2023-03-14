
public class linearsearch {
    public static int ls(int rank[], int key){

        for(int i = 0;i<rank.length;i++){
            if(rank[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int rank[]= {2,4,6,8,10,12,14,16,18};
        int key = 10;
        int index = ls(rank, key);
        
        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at "+ index);
        }
    }
}    
