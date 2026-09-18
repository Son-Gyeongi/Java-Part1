package section13;

// [필수실습 13-5] 2차원 배열 순차 채우기
public class Test13_5 {
    static void main(String[] args) {
        int[][] array = new int[5][5];
        int cnt = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = cnt++;
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
