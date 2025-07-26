public class maxminarray {
    public static void main(String[] args) {
        int[] a={20,30,40,50,60};
        int max=a[0],min=a[0];
        for(int val:a){
            if(val>max) max=val;
            if(val<max) max=val;

        }
        System.out.println("max:"+ max+" min:"+min);
    }
    
}
