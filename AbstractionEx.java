abstract class hello{
    void colleges(){
        System.out.println("CSE");
    }
    abstract void rasipuram();
}
public class AbstractionEx extends hello {
  //we need to override to get properties from the abstract class.
    void rasipuram() {
        System.out.println("Rasipuram ");
    }

    public static void main(String[] args) {
        AbstractionEx a = new AbstractionEx(); // Creating an instance of the subclass
        a.colleges(); // Calls the method from the parent class
        a.rasipuram(); // Calls the implemented abstract method
    }
}
