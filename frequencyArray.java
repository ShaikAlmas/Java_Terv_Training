import java.util.Scanner;
public class frequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter "+size+" elements: ");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        int[] c = new int[size];
        for(int i=0;i<a.length;i++){
            c[a[i]]++;
        }
        for(int freq =1;freq<=size;freq++){
            for(int i=c.length-1;i>=0;i--){
                if(c[i]==freq){
                    for(int j=0;j<freq;j++){
                        System.out.print(i+" ");
                }
        }
    }
   sc.close();
    }
}
}