package sort;

public class Bubble implements SortService {

    @Override
    public void sort(int[] arr) {
        sort2(arr);
    }

    private void sort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
            ArrayUtils.print("第" + (arr.length - i) + "轮", arr);
        }
    }

    private void sort2(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
            ArrayUtils.print("第" + (arr.length - i) + "轮", arr);
        }
    }
}
