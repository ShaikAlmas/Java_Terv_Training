public class Threading extends Thread{
    public void run(){
        System.out.println("Hi- " + Thread.currentThread().threadId());
        System.out.println("Bye- " + Thread.currentThread().threadId());
        System.out.println("Tata- " + Thread.currentThread().threadId());
    }
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            Threading t = new Threading();
            t.start(); // This will call the run method in a new thread //start--> multi thread //run--> single thread
        }
    }
}
