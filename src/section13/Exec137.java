package section13;

// [필수실습 13-7] 좌절 금지 달팽이
public class Exec137 {
    static void main(String[] args) {
        int[][] array = new int[5][5];

        int x = -1, y = 0, cnt = 0;

        boolean flag = true;
        for (int length = 9; length > 0; length -= 2) {
            if (flag) {
                for (int i = 0; i < length; i++) {
                    if (i < length / 2 + 1) {
                        ++x;
                    } else {
                        ++y;
                    }
                    array[y][x] = ++cnt;
                }
            } else {
                for (int i = 0; i < length; i++) {
                    if (i < length / 2 + 1) {
                        --x;
                    } else {
                        --y;
                    }
                    array[y][x] = ++cnt;
                }
            }

            flag = !flag;
        }

        for (int[] arr : array) {
            for (int data : arr) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}
