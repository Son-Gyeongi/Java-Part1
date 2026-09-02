package section9;

import java.util.Scanner;

public class Test9_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("AVG: %.2f", (num1+num2)/2.0);
    }
}
