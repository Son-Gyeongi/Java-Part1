package section11;

import java.util.Scanner;

// [필수실습 11-1] 최댓값 구하기 (if문 버전)
public class Test11_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int max = input;

        input = sc.nextInt();
        if (input > max) {
            max = input;
        }

        input = sc.nextInt();
        if (input > max) {
            max = input;
        }

        System.out.printf("MAX: %d", max);
    }
}
