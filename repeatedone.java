public class repeatedone {
    public static void main(String[] args) {
    int a[]={1,1,1,0,1};
    int count = 0;
    for(int i=0;i<a.length;i++){
        if(a[i]==1) count++;
        if(a[i]==0)count--;
    }
    System.out.println((count<1)?"True":"False");
}
}
