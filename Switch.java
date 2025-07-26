
public class Switch {
    public static void main(String[]args){
int seat=200;
seat%=8;
switch(seat){
case 1: System.out.println("Lower"); break;
case 2:System.out.println("Middle"); break; 
case 3:System.out.println("Upper");  break;
case 4: System.out.println("Lower");  break; 
case 5: System.out.println("Middle"); break;
case 6: System.out.println("Upper");  break;
case 7: System.out.println("Side Lower"); break; 
case 0: System.out.println("Side Upper"); break;  
}
    }
}
