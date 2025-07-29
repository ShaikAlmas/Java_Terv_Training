  public class Threading2 extends Thread{
    public void run()
    {
        System.out.println("hai - "+Thread.currentThread().threadId());
         System.out.println("hai - "+Thread.currentThread().threadId());
          System.out.println("hai - "+Thread.currentThread().threadId());
    }
    public static void main(String[] args) {
        Threading2 m1=new Threading2();
        m1.start();
        try{
            m1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        Threading2 m2=new Threading2();
        m2.start();
        try{
            m2.join();
        }
        catch(Exception e){
            System.out.println(e);
    }
    Threading2 m3=new Threading2();
        m3.start();
        try{
            m3.join();
        }
        catch(Exception e){
            System.out.println(e);
}
    }
}
// This code demonstrates the use of the Thread class and the join method in Java.
// The Threading2 class extends the Thread class and overrides the run method to print messages.
// In the main method, three instances of Threading2 are created and started.   
