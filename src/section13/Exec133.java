package section13;

// [필수실습 13-4] 행과 열의 합 구하기
public class Exec133 {
    static void main(String[] args) {
        int[][] array = {
                {10, 20, 30, 0},
                {40, 50, 60, 0},
                {0, 0, 0, 0}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][3] += array[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                array[2][i] += array[j][i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int data : array[i]) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}
