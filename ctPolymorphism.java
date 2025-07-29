public class ctPolymorphism {  //compile time polymorphism AKA Method Overloading
    // Method Overloading: Same method name with different parameters
    public void add(int x,int y){ //method declaration
        System.out.println(x+y);
    }
    public void add(int x,int y, int z){
        System.out.println(x+y+z);
    }
    public static void main(String[] args) {
        // Example of polymorphism with method overriding
       ctPolymorphism c=new ctPolymorphism(); //here c is a reference variable of type ctPolymorphism , also known as instance reference or object.
        c.add(2, 3); // Method definition //Calls the first add method
        c.add(2, 3, 4); // Calls the second add method
    }
}