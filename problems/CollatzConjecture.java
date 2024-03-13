package problems;
import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to generate the sequence: ");
        int n = sc.nextInt();

        while(n != 1) {
            if(n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = 3 * n + 1;
                System.out.println(n);
            }
        }
    }
}
