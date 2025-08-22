// Write a function that takes in the radius as input and returns the circumference of a circle

import java.util.*;

public class RadiusOfCircle1
{ 
    public static double circumference (double radius) {
        double pi = 3.14;
        
        double c = 2 * pi * radius;
        return c;
    }
    
    
	public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter Radius: ");
       int radius = sc.nextInt();  
       
      double result = circumference(radius);
      System.out.print(result);
     
       
	}
}