package section10;

public class Exec101 {
    static void main() {
        int a = 9;
        int b = 3;
//        int result = a - b;
        int result = a + (~b + 1); // 2의 보수
        System.out.print(result);
    }
}
