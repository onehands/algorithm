package sort;

public class Selection implements SortService {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int tmp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = tmp;
            ArrayUtils.print("第" + (i + 1) + "轮", arr);
        }
    }
}
