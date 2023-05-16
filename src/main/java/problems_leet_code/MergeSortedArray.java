package problems_leet_code;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 4, 5, 6};
        int[] nums2 = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        int[] result = new int[nums1.length + nums2.length];
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nums1[i];
            System.out.println(result[i]);
        }
        for (int i = 0; i < nums2.length; i++) {

        }

    }

}



