package section13;

// [필수실습 13-2] 버블정렬
public class Exec132 {
    static void main(String[] args) {
        int[] array = {40, 30, 50, 20, 10};
        int tmp;

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + "\t");
        }
    }
}
