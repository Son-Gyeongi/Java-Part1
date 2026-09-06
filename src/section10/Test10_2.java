package section10;

import java.util.Scanner;

public class Test10_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int a = sc.nextInt();

        String message = (0 <= a && a <= 100) ?
                ((a >= 80) ? "합격" : "불합격") : "0~100점 사이 점수를 입력해주세요";

        System.out.printf("결과: %s", message);
    }
}
