package section12;

public class Exec124 {
    static void main() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 + i; j++) {
                if (j < 4 - i)
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }
            System.out.print('\n');
        }
    }
}
