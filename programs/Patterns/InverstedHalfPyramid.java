package Patterns;

public class InverstedHalfPyramid {
    public static void main(String[] args) {
        int n = 5; // height of the pyramid

        // outer loop for each row
        for (int i = n; i >= 1; i--) {
            // inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // move to the next line after each row
            System.out.println();
        }
    }
    
}
