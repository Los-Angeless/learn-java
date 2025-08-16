// Inverted & Rotated Half Pyramid

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5; // size of the pattern
        

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i-1; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line after each row
        }
    }
}
