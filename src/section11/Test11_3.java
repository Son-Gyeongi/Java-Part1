package section11;

import java.util.Scanner;

// [필수실습 11-3] 연령별 버스요금 계산
public class Test11_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int fare = 1000;

        if (age <= 19) {
            if (age >= 14) {
                fare = (int) (fare * 0.75);
            } else {
                if (age >= 3) {
                    fare = (int) (fare * 0.5);
                } else {
                    fare = 0;
                }
            }
        }

        System.out.printf("나이: %d, 최종요금: %d", age, fare);
    }
}
