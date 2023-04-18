package problems_leet_code;

import java.util.HashSet;
import java.util.Set;

public class ContainsDublecate {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 4};
        Set<Integer> set = new HashSet<>();
        boolean duplicate = false;
        for (int i : ar) {
            if (!set.add(i)) {
                duplicate = true;
                break;
            }
        }
        System.out.println(duplicate);

    }

}


