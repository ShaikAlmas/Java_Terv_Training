import java.util.Arrays;

public class stringMethod {
    public static void main(String[] args) {
        String a="almas";
        String b="kushi";
        String[] c=a.split(" ");
      System.out.println(a.length()); //Prints length of name (number)
      System.out.println(a.charAt(3)); //Prints character at index(i)
      System.out.println(a.substring(0,2));
      System.out.println(a.toLowerCase());
      System.out.println(a.toUpperCase());
      System.out.println(a.contains("a"));
      System.out.println(a.replace('s','a'));
      System.out.println(Arrays.toString(c));
      System.out.println(a.trim());
      System.out.println(a.equals(b));
      System.out.println(a.equalsIgnoreCase(b));

    }
}
