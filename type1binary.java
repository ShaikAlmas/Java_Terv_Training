public class type1binary {
    public static void main(String[] args) {
        int n=5;
        int binary=1;
        while(binary<=n){
            binary = binary*2;
        }
        binary = binary/2;
        System.out.println(2*(n-binary)+1);
    }
}
