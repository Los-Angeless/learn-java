import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
       double area =  pi * (r*r);
        System.out.println(area);
        sc.close();
    }
}