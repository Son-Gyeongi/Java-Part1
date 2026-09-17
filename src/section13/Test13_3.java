package section13;

// [필수실습 13-3] 선택정렬
public class Test13_3 {
    static void main(String[] args) {
        int[] array = {40, 30, 50, 20, 10};

        for (int i = 0; i < array.length - 1; i++) {
            int idxMin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[idxMin] > array[j]) {
                    idxMin = j;
                }
            }

            int temp = array[i];
            array[i] = array[idxMin];
            array[idxMin] = temp;
        }

        for (int data : array) {
            System.out.print(data + "\t");
        }
    }
}
