public class averagearray {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int sum=0;
        for(int val:a){
            sum=sum+val;
        }
        System.out.println("Average:"+(sum/a.length));
    }
    
}
