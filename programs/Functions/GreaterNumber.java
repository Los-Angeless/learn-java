// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class GreaterNumber {
    
    public static int findGreaterNumber(int a, int b) {
        
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter Number2: ");
        int num2 = sc.nextInt();
        
       int result = findGreaterNumber(num1,num2);
       System.out.print("The Greater Number is: " + result);
        sc.close();
    }
}