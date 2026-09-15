package section13;

import java.util.Arrays;

// [필수실습 13-2] 버블정렬
public class Test13_2 {
    static void main(String[] args) {
        int[] array = {40, 30, 50, 20, 10};

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < temp) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
