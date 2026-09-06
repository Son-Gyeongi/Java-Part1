package section10;

import java.util.Scanner;

// [필수실습 10-4] 최댓값 구하기 (토너먼트 방식)
public class Test10_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;

        System.out.printf("MAX: %d", max);
    }
}
