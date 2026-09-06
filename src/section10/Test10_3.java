package section10;

import java.util.Scanner;

public class Test10_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int a = sc.nextInt();
        max = max >= a ? max : a;

        a = sc.nextInt();
        max = max >= a ? max : a;

        a = sc.nextInt();
        max = max >= a ? max : a;

        System.out.printf("MAX: %d", max);
    }
}
