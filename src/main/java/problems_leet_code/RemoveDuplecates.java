package problems_leet_code;

public class RemoveDuplecates {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 1, 2, 2, 3, 3, 4, 5, 6, 6, 45, 45, 50, 66, 66, 77};
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j++] = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
