package section9;

import java.util.Scanner;

public class Exec91 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.printf("AVG: %.2f\n", (a + b) / 2.0);
    }
}
