package section12;

public class Test12_1 {
    static void main() {
        int sumFor = 0, sumWhile = 0;

        for (int i = 1; i <= 10; i++) {
            sumFor += i;
        }

        int cnt = 1;
        while (cnt <= 10) {
            sumWhile += cnt;
            cnt++;
        }

        System.out.printf("Total: %d\n", sumFor);
        System.out.printf("Total: %d", sumWhile);
    }
}
