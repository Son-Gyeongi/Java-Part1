package section11;

import java.util.Scanner;

// [필수실습 11-3] 연령별 버스요금 계산
public class Exec113 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Age: ");
        int age = sc.nextInt();
        double rate = 0.0;

        if (age < 14) {
            if (age < 4)
                rate = 0.0;
            else
                rate = 0.5;
        } else {
            if (age >= 20)
                rate = 1.0;
            else
                rate = 0.75;
        }

        double fee = 1000 * rate;
        System.out.println((int)fee);
    }
}
