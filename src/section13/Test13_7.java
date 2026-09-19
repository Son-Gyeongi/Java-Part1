package section13;

// [필수실습 13-7] 좌절 금지 달팽이
public class Test13_7 {
    static void main(String[] args) {
        int[][] array = new int[5][5];
        int cnt = 1;

        int i=0;
        int j=0;

        for (; j < array.length; j++) {
            array[i][j] = cnt++;
        }

        for (i += 1; i < j; i++) {
            array[i][j - 1] = cnt++;
        }

        i=4;
        j=3;

        for (; j >= 0; j--) {
            array[i][j] = cnt++;
        }

        for (i -= 1; i > 0; i--) {
            array[i][j+1] = cnt++;
        }

        for (int[] arr : array) {
            for (int data : arr) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}
