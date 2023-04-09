package problems_leet_code;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 6, 6, 3, 3, 5, 5};

        Set<Integer> un = new HashSet<Integer>();
        for (int n : arr) {
            if (un.contains(n)) {
                un.remove(n);
            } else {
                un.add(n);
            }
        }
        System.out.println(un.iterator().next());
    }
}

