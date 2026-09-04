package section10;

import java.util.Scanner;

public class Test10_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 뺄셈 연산 직접 구현(비트 연산자 이용)
        System.out.printf("결과: %d", num1 + (~num2+1));
    }
}
