public class even_no {
    public static void main(String[] args) {
        int n= 20;
      //  System.out.println((n%2)==0?"Even":"Odd"); //using modulus operator 
    //  System.out.println((n&1)==0?"Even":"Odd"); //using logical And , it uses binary logic 
    System.out.println(((n/2)*2)==n?"Even":"Odd"); //another method without using modulus operator 
    }
}
