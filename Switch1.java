import java.util.Scanner;   
public class Switch1{
    public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int seat=scan.nextInt();
seat%=8;
scan.close();
switch(seat){
case 1 ,4: System.out.println("Lower"); break;
case 2, 5:System.out.println("Middle"); break; 
case 3, 6:System.out.println("Upper");  break;
case 7: System.out.println("Side Lower"); break; 
case 0: System.out.println("Side Upper"); break;  
}
    }
}
