package section13;

// [필수실습 13-7] 좌절 금지 달팽이
public class Test13_7_2 {
    static void main(String[] args) {
        int[][] array = new int[5][5];
        int cnt = 1;

        int[] x = {0, 1, 0, -1};
        int[] y = {1, 0, -1, 0};

        int idxX = 0;
        int idxY = -1;
        while (cnt < 25) {
            for (int i = 0; i < 4; i++) {
                idxX += x[i];

                for (int j = 0; j < 5; j++) {
                    idxY += y[i];

                    System.out.println(idxX+", "+idxY);
                    array[idxX][idxY] = cnt++;
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
