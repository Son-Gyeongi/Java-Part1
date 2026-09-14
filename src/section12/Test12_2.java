package section12;

public class Test12_2 {
    static void main() {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
