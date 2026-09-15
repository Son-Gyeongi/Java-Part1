package section13;

public class Test13_1 {
    static void main(String[] args) {
        int[] array = {50, 40, 10, 30, 20};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        System.out.printf("MAX: %d", max);
    }
}
