public class linearSearchArray {
    public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40}; 
    int key = 30; 
    boolean found = false;
   for(int val : arr){
     if(val == key)
     found = true; break; 
   }
     System.out.println(found ? "Found" : "Not Found");
}
}
