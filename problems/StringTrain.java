package problems;

import java.util.Scanner;

public class StringTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string of odd length: ");
        String str = sc.nextLine();

        System.out.println(stringTrain(str));
    }

    public static String stringTrain(String str) {
        StringBuilder out = new StringBuilder();
        int midIndex = (str.length() / 2);

        out.append(str.charAt(midIndex));

        int beforeRep = 2;
        for(int i = midIndex - 1; i >= 0; i--) {
            for(int j = 1; j < beforeRep; j++) {
                out.insert(0, str.charAt(i));
            }
            beforeRep++;
        }

        int afterRep = 2;
        for(int i = midIndex + 1; i < str.length(); i++) {
            for(int j = 1; j <= afterRep; j++) {
                out.append(str.charAt(i));
            }
            afterRep++;
        }

        return out.toString();
    }
}