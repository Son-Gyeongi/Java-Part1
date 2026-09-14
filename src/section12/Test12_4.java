package section12;

public class Test12_4 {
    static void main() {
        for (int i = 0; i < 5 ; i++) {
            for (int x = 4 - i; x > 0; x--) {
                System.out.print("\t");
            }

            for (int j = 0; j < (i + 1); j++) {
                System.out.print("*\t");
            }

            for (int y = 1; y < i + 1; y++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
