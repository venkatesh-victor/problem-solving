package problems;

import java.util.Scanner;

public class CheckCharacterExistence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to be searched: ");
        char c = sc.next().charAt(0);

        System.out.println(contains(str, c));
    }  

    public static boolean contains(String str, char c) {
        if(str.length() < 1)
            return false;

        if(str.charAt(0) == c) {
            return true;
        } else {
            return contains(str.substring(1), c);
        }
    }
}
