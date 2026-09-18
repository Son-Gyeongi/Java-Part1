package section13;

// [필수실습 13-6] 교차
public class Exec136 {
    static void main(String[] args) {
        int[][] array = new int[5][5];
        int cnt = 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = cnt++;
                }
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][array[0].length - j -1] = cnt++;
                }
            }
        }

        for (int[] arr : array) {
            for (int data : arr) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}
