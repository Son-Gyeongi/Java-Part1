package section9;

import java.util.Scanner;

public class Test9_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int hour, minute, second;

        hour = time / (60 * 60);
        minute = (time % (60 * 60)) / 60;
        second = (time % (60 * 60)) % 60;

        System.out.printf("%d초는 %02d시간 %02d분 %02d초 입니다.", time, hour, minute, second);
    }
}
