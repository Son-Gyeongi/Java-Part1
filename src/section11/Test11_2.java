package section11;

import java.util.Scanner;

// [필수실습 11-2] 버스요금 계산
public class Test11_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int fare = 1000;

        if (age < 20) {
            fare = (int) (fare - (fare * 0.25));
        } else {
            age = 20;
        }

        System.out.printf("나이: %d, 최종요금: %d", age, fare);
    }
}
