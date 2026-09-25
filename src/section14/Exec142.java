package section14;

public class Exec142 {
    static void main() {
        String input = "Hello";
        printChar(input, input.length() - 1);
    }

    public static void printChar(String param, int idx) {
        if (idx < 0) return;

        System.out.print(param.charAt(idx));
        printChar(param, idx - 1);
    }
}
