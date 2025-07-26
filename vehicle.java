public class vehicle{
    public static void main(String[] args) {
        int w=540;
         int v= 200;
         int tw=(((v*4)-w)/2);
        if((w &1)==0)
        System.out.println("tw:"+ tw + " fw:" + (v-tw));
        else
        System.out.println("invalid");

    }
}