package sort;

public class Shell implements SortService {
    @Override
    public void sort(int[] arr) {
        int h = 1;
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }

        while (h > 0) {
            for (int i = h; i < arr.length; i++) {
                if (arr[i] < arr[i - h]) {
                    int tmp = arr[i];
                    int j = i - h;
                    for (; j >= 0 && arr[j] >= tmp; ) {
                        arr[j + h] = arr[j];
                        j -= h;
                    }
                    arr[j + h] = tmp;
                }
            }
            ArrayUtils.print("", arr);
            h = (h - 1) / 3;
        }

    }
}
