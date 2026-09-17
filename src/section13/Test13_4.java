package section13;

// [필수실습 13-4] 행과 열의 합 구하기
public class Test13_4 {
    static void main(String[] args) {
        int[][] array = {
                {10, 20, 30, 0},
                {40, 50, 60, 0},
                {0, 0, 0, 0}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length - 1; j++) {
                array[i][array[0].length - 1] += array[i][j];

                if (j != array[0].length - 2) {
                    array[array.length - 1][i] += array[j][i];
                }
            }
        }
//            System.out.println(Arrays.deepToString(array));
        for (int[] arr : array) {
            for (int data : arr) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}
