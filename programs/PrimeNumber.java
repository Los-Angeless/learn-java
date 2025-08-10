public class PrimeNumber {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}



//////////////////////////////////////////////////////////////////////////////////

/*
 import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		
		int n = sc.nextInt();
		Boolean isPrime = true;
		
		if (n<=1) {
		    isPrime = false;
		} else {
		    for (int i = 2;i<=Math.sqrt(n); i++ ) {
		        if (n%i ==0) {
		            isPrime = false;
		            break;
		        } 
		    }
		    
		}
		if (isPrime) {
		    System.out.println(n + " Prime Number");
		} else {
		    System.out.println(n + " Not a prime Number");
		}
		sc.close();
	}
}

 */