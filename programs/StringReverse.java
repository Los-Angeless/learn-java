class StringReverse {
    public static void main(String[] args) {
        String OG = "hello";

        String reversed = new StringBuilder(OG).reverse().toString();
        System.out.println(reversed);

    }
}


//////////////////////////////////////////////////
 

  /*
   import java.util.*;
    
    public class Main {
       
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
   
     System.out.print("Enter String: ");
     String OG = sc.nextLine();
     
     String Reversed = new StringBuilder(OG).reverse().toString();
     System.out.println(Reversed);
     
     sc.close();
     
     
    }
}

*/

