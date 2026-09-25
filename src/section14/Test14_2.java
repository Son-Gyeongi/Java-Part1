package section14;

import java.util.Scanner;

public class Test14_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printString(s, 0);
    }

    public static void printString(String str, int point) {
        if (str.length() == point) return;
        printString(str, point + 1);
        System.out.print(str.charAt(point));
    }
}
