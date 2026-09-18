package section13;

// [필수실습 13-6] 교차
public class Test13_6 {
    static void main(String[] args) {
        int[][] array = new int[5][5];
        int cnt = 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = cnt++;
                }
            } else {
                for (int j = array.length - 1; j >= 0; j--) {
                    array[i][j] = cnt++;
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
