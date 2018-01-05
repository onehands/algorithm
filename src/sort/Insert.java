package sort;

public class Insert implements SortService {
    @Override
    public void sort(int[] arr) {
        sort2(arr);
    }

    public void sort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int tmp_index = i - 1;

            while (tmp_index >= 0 && arr[tmp_index] >= min) {
                arr[tmp_index + 1] = arr[tmp_index];
                tmp_index--;
            }
            arr[tmp_index + 1] = min;
            ArrayUtils.print("第" + (i) + "轮", arr);
        }
    }

    public void sort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int tmp = arr[i];
                int j;
                for (j = i - 1; j >= 0 && arr[j] > tmp; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = tmp;
            }
            ArrayUtils.print("第" + (i) + "轮", arr);
        }
    }
}
