public class methods {
    public static void add(int a,int b)
    { //with arguments without return type
    System.out.println(a+b);
    }
    public static int sub(int a, int b){ //with arguments with return type
        return a-b;
    }
    public static void line(){ //without arguments without return type
        System.out.println("========");
    }
    public static int mul(){ 
     int a=10,b=30;
      return a*b; //Without arguments with return type
    }

    public static void main(String[] args) {
        int a=20;line();line();int b=50;
        add(a, b);
        sub(a,b);
        mul();
    }
}
