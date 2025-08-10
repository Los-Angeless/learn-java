import java.util.*;

public class EvenNumber
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		
		int num  = sc.nextInt();
		 Boolean isEven = (num%2==0);
		 
		 if (isEven) {
		     System.out.println(num + " is Even");
		 } else {
		     System.out.println(num + " Not Even");
		 }
		
	
		sc.close();
	}
}


///////////////////////////////////////////////////////////////
/* 
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		
		int n  = sc.nextInt();
		
		for (int i = 2; i<=n ; i+=2){
		    System.out.println(i + " ");
		} 
		
			
		sc.close();
	}
}
*/