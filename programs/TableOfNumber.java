import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int Number = sc.nextInt();
        
        System.out.println("table of " + Number + ":");
        
        for (int i = 1; i<=10; i++) {
            System.out.println(Number + "x" + i + "=" + Number * i);
        } 

        sc.close();
    }
}