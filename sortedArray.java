

public class sortedArray {
    public static void main(String[] args) {
        int [] a={10,5,20,25,15};
        boolean sorted = true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i]+1){
                sorted = false;
                break;
            }
        }
        System.out.println(sorted?"Sorted":"Not Sorted");
    }
    
}
