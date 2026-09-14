package section12;

public class Test12_3 {
    static void main() {
        for (int i = 1; i <= 5 ; i++) {
            for (int x = 5 - i; x > 0; x--) {
                System.out.print("\t");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
