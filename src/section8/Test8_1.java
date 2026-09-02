package section8;

import java.util.Scanner;

public class Test8_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("이름을 입력하세요:");
        String name = sc.nextLine();

        System.out.println();

        System.out.printf("당신의 나이는 %d살이고 이름은 '%s'입니다.", age, name);
    }
}
