package problems;

import java.util.Scanner;

public class OffByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the first array: ");
        int aSize = sc.nextInt();
        int[] a = new int[aSize];

        System.out.print("Enter the size of the next array: ");
        int bSize = sc.nextInt();
        int[] b = new int[bSize];

        System.out.println("Enter the elements one by one for the first array: ");
        for(int i = 0; i < aSize; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the elements one by one for the next array: ");
        for(int i = 0; i < bSize; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(offByOne(a, b, 0));
    }

    public static boolean offByOne(int[] a, int[] b, int index) {

        if(index >= a.length) {
            return true;
        }

        if(a.length != b.length) {
            return false;
        }

        if(a[index] + 1 != b[index]) {
            return false;
        }

        else {
            return offByOne(a, b, index + 1);
        }
    }

}
