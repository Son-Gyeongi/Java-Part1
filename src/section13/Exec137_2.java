package section13;

// [필수실습 13-7] 좌절 금지 달팽이
public class Exec137_2 {
    static void main(String[] args) {
        int[][] array = new int[5][5];

        int x = -1, y = 0, cnt = 0;
        int direction = 1;

        for (int length = 9; length > 0; length -= 2) {
            for (int i = 0; i < length; i++) {
                if (i < length / 2 + 1) {
                    x += direction;
                } else {
                    y += direction;
                }
                array[y][x] = ++cnt;
            }

            direction = -direction;
        }

        for (int[] arr : array) {
            for (int data : arr) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}
