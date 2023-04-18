package problems_leet_code;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "aaleel";
        int index = -1;
        Set<Character> uniqChars = new HashSet<>();
        Set<Character> repeatedChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (repeatedChars.contains(c)) {
                continue;

            }
            if (uniqChars.contains(c)) {
                uniqChars.remove(c);
                repeatedChars.add(c);

            } else {
                uniqChars.add(c);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (uniqChars.contains(s.charAt(i))) {
                index = i;
                break;
            }

        }
        System.out.println( index);
    }

}