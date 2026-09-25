package section14;

import java.util.Scanner;

public class Exec141 {
    static void main() {
        Scanner s = new Scanner(System.in);
        int[] inputArr = new int[3];

        System.out.print("세 정수를 입력: ");
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = s.nextInt();
        }

        System.out.println("MAX: " + getMax(inputArr));
    }

    public static int getMax(int[] paramArr) {
        int max = paramArr[0];
        for (int i = 1; i < paramArr.length; i++) {
            if (paramArr[i] > max) {
                max = paramArr[i];
            }
        }

        return max;
    }
}
