package section14;

import java.util.Scanner;

public class Test14_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = getMax(a, b, c);
        System.out.println("MAX : " + max);
    }

    public static int getMax(int a, int b, int c) {
        int tmp = a;

        if (tmp < b) {
            tmp = b;
        }

        if (tmp < c) {
            tmp = c;
        }

        return tmp;
    }
}
