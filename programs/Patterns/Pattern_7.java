// Inverted Half Pyramid with Numbers
package Patterns;

public class Pattern_7 {
    public static void main(String[] args) {
        int n = 5; // size of the pattern
        

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n-i+1; j++) { 
            System.out.print(j);
            }
            System.out.println();
            
        }
    }
}
