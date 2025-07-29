   interface hey
{
    void clg();
   
}
public class InterfaceEx implements hey
{
    public void clg()
    {
        System.out.print("Message");
    }
    public static void main (String[] args) 
    {
        InterfaceEx m=new InterfaceEx();
        m.clg();
    }
}

