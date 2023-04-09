package problems_leet_code;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1 = List.of(1,3,3,4,4,5,7);
        list2 = List.of(2,2,5,6,8,8,9);
        List<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        Collections.sort(list);
        System.out.println(list);


    }

}





