package section10;

import java.util.Scanner;

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
