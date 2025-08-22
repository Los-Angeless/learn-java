//  Write a function to print the sum of all odd numbers from 1 to n.


import java.util.*;

public class SumOfOddNumber {
    
    public static void sumOfOdd(int n) {
        int sum = 0;
        
        for (int i = 1; i<=n; i++) {
            if (i % 2 != 0) {           // check condition 
            sum+=i;
            }
        } 
        System.out.println("Total Number of Sum from 1 to " + n + " is : " + sum);
    }
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        
        sumOfOdd(n);
        
        sc.close();
        
    }
}