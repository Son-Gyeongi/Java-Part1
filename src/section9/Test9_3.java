package section9;

import java.util.Scanner;

public class Test9_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp;

        tmp = a;
        a = b;
        b = tmp;
        System.out.printf("a:%d, b:%d", a, b);
    }
}
