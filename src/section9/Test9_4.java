package section9;

import java.util.Scanner;

public class Test9_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        sum += a;

        a = sc.nextInt();
        sum += a;

        a = sc.nextInt();
        sum += a;

        System.out.print("Total: " + sum);
    }
}
