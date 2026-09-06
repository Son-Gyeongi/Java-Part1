package section10;

import java.util.Scanner;

// [필수실습 10-3] 최댓값 구하기 (서바이벌 방식)
public class Exec103 {
    static void main() {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int max = input; // 처음에 입력된 값이 무조건 최대

        input = s.nextInt();
        max = (input > max) ? input : max; // Math.max(input, max)

        input = s.nextInt();
        max = (input > max) ? input : max;

        System.out.println(max);
    }
}
