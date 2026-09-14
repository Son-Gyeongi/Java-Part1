package section12;

public class Test12Gugudan {
    static void main() {
        for (int i = 2; i < 10; i++) {
            System.out.println(i + " 단");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
