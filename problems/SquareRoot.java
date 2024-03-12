package problems;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("The square root of " + n + " rounded to the nearest integer is " + sqrt(n));
    }

    public static int sqrt(int n) {
        int a = 1;

        while(n > a * a) {
            a++;
        }

        if(a * a == n) 
            return a;
        
        else 
            return (n - ((a - 1) * (a - 1)) < (a * a) - n) ? a - 1 : a;
    }
}
