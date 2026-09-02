package section9;

import java.util.Scanner;

public class Exec92 {
    static void main() {
        Scanner s = new Scanner(System.in);

        int input = s.nextInt();
        int hour = input / 3600;
        int min = (input % 3600) / 60;
        int sec = input % 60; // (input % 3600) % 60
        System.out.printf("%02d:%02d:%02d\n", hour, min, sec);
    }
}
