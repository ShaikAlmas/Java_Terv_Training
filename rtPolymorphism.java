
    // runtime polymorphism AKA Method Overriding
    class hai{
        void college(){
            System.out.println("IT");
        }
    }
   public class rtPolymorphism extends hai {
        void college(){
            System.out.println(" CSE ");
        }
        public static void main(String[] args) {
            rtPolymorphism r = new rtPolymorphism(); // Reference of parent class pointing to child class object
            r.college(); // Calls the overridden method in rtPolymorphism class
        }
    }

