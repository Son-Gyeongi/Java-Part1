package section10;

import java.util.Scanner;

public class Exec102 {
    static void main() {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        input = (input < 0) ? 0 : input; // Math.max(input, 0)
        input = (input > 100) ? 100 : input; // Math.min(input, 100)

        String result = (input >= 80) ? "합격" : "불합격";
        System.out.println(result);
        System.out.println(input);
    }
}
