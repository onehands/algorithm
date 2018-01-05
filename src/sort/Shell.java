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
                    int j = i;
                    for (; j > h - 1 && arr[j - h] >= tmp; ) {
                        arr[j] = arr[j - h];
                        j -= h;
                    }
                    arr[j] = tmp;
                }
            }
            ArrayUtils.print("", arr);
            h = (h - 1) / 3;
        }

    }
}
