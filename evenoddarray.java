public class evenoddarray {
    public static void main(String[] args) {
        int even =0,odd=0;
        int[]a={1,2,3,4,5};
        for(int val:a){
            if(val%2==0) even++;
            else odd++;
        }
        System.out.println("Even:"+ even +" Odd:"+ odd);
    }
}
