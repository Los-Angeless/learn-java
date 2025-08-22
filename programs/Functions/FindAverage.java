//  find the Total number1 of average using function and user input

import java.util.*;

public class FindAverage
{
    
    public static int  average(int a, int b, int c) {
        return(a+b+c)/3 ;
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int a = sc.nextInt();
		
		System.out.print("Enter number2: ");
		int b = sc.nextInt();
		
		System.out.print("Enter number3: ");
		int c = sc.nextInt();
		
	    double avg =	average(a,b,c);
		System.out.println("Average of Total Number is: "+ avg);
		
	}
}