import java.util.Arrays;

public class replaceEvenWith0 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0) a[i]=0;
        }
        System.out.println(Arrays.toString(a));
    }
}
