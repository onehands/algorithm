package sort;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10, 13, 15, 16};
        int[] tmp = new int[a.length + b.length];
        merge(a, b, tmp);
        System.out.println(Arrays.toString(tmp));
    }

    private static void merge(int[] a, int[] b, int[] tmp) {
        int index = 0;
        int i = 0, j = 0;
        while (i < a.length || j < b.length) {
            if (i >= a.length) {
                tmp[index] = b[j];
                j++;
                index++;
                continue;
            }
            if (j >= b.length) {
                tmp[index] = a[i];
                i++;
                index++;
                continue;
            }
            if (a[i] >= b[j]) {
                tmp[index] = b[j];
                index++;
                j++;
            }
            if (a[i] < b[j]) {
                tmp[index] = a[i];
                index++;
                i++;
            }
        }

    }

}
