 class pradeep{
void nikitha(){
        System.out.println("lover");
    }
}
class Sathyaraj{
    void nikitha(){
        System.out.println("daughter");
    }
}

public class polymorphismRevi {
    void nikitha(){
        System.out.println("Brother Mari");
    }

    public static void main(String[] args) {
        pradeep p = new pradeep();
        polymorphismRevi r = new polymorphismRevi();
        Sathyaraj s = new Sathyaraj();
        p.nikitha(); // Calls pradeep's nikitha method

        s.nikitha(); // Calls Sathyaraj's nikitha method

        r.nikitha(); // Calls polymorphismRevi's nikitha method
    }
}

