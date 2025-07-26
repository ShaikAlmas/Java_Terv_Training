public class vehicle2 {
      public static void main(String[] args) {
        int w=54;
         int v= 200;
         int tw=(((v*4)-w)/2); /*there are three conditions : 1.vehicle should be even so we use (w&1==0) 
         2. Wheels should not be less than vehicles ,so we use(w>v) and 3. Vehicles should not be less than the amount of wheels ,
         eg:w=540,v=20 The wheels would be left over and criterio wont be satisfied so we use 
         */
        if((w &1)==0&&(w>v))
        System.out.println("tw:"+ tw + " fw:" + (v-tw));
        else
        System.out.println("invalid");

    }
}
