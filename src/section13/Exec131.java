package section13;

public class Exec131 {
    static void main() {
        int[] array = {50, 30, 40, 20, 10};
        int max = array[0];
        for (int data : array) {
            if (data > max) {
                max = data;
            }
        }

        System.out.println("MAX: " + max);
    }
}
