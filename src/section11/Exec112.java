package section11;

import java.util.Scanner;

// [필수실습 11-2] 버스요금 계산
public class Exec112 {
    static void main() {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        int fee = 1000;

        if (age < 20) {
//            fee = 750;
            fee = (int) (fee * 0.75);
        }

        if (age >= 20) {
            age = 20;
        }

        System.out.printf("나이: %d, 최종요금: %d", age, fee);
    }
}
