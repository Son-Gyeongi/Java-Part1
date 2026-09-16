package section13;

import java.util.ArrayList;
import java.util.List;

// 퀵 정렬 - 오류 해결하기
public class Test13Quick_1 {
    static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(3);
        array.add(8);
        array.add(4);
        array.add(2);
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        while (true) {
            arr1.clear();
            arr2.clear();
            int target = array.getFirst();

            for (int i = 1; i < array.size(); i++) {
                if (target >= array.get(i)) {
                    arr1.add(array.get(i));
                } else {
                    arr2.add(array.get(i));
                }
            }

            array.clear();

            array.addAll(arr1);
            array.add(target);
            array.addAll(arr2);

            if (arr2.size() == array.size() - 1) {
                break;
            }
        }

        System.out.println(array);
    }
}
