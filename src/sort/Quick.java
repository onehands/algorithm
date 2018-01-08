package sort;

public class Quick implements SortService {
    @Override
    public void sort(int[] arr) {
        domain(arr, 0, arr.length - 1);
    }

    private static void domain(int[] arr, int left, int right) {
        if (right <= left) {
            return;
        }
        int point = arr[right];
        int partition = partition(arr, left, right, point);
        domain(arr, left, partition - 1);
        domain(arr, partition + 1, right);
    }

    private static int partition(int[] arr, int left, int right, int point) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (leftPtr < rightPtr && arr[++leftPtr] < point) ;
            while (leftPtr < rightPtr && arr[--rightPtr] > point) ;
            if (leftPtr >= rightPtr) {
                break;
            } else {
                int tmp = arr[leftPtr];
                arr[leftPtr] = arr[rightPtr];
                arr[rightPtr] = tmp;
            }
        }
        int tmp = arr[leftPtr];
        arr[leftPtr] = arr[right];
        arr[right] = tmp;
        return leftPtr;
    }
}
