package problems_leet_code;

import java.util.*;

public class CommonNamber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            list.add(random.nextInt(300));

        }
        System.out.print(list);

        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (Integer number : list) {
            if (countMap.containsKey(number)) {
                countMap.put(number, countMap.get(number) + 1);
            } else {
                countMap.put(number, 1);
            }
        }

        int maxNumber = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxNumber = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println( "\n" + "Число которое встречалось чаще всего: " + maxNumber);
    }
}

