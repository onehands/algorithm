package sort;

public class Quick implements SortService {
    @Override
    public void sort(int[] arr) {
//        domain(arr, 0, arr.length - 1);
        quickSort(arr, 0, arr.length - 1);
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

    public static void quickSort(int arr[], int _left, int _right) {
        int left = _left;
        int right = _right;
        int temp = 0;
        if (left <= right) {   //待排序的元素至少有两个的情况
            temp = arr[left];  //待排序的第一个元素作为基准元素
            while (left != right) {   //从左右两边交替扫描，直到left = right

                while (right > left && arr[right] >= temp)
                    right--;        //从右往左扫描，找到第一个比基准元素小的元素
                arr[left] = arr[right];  //找到这种元素arr[right]后与arr[left]交换

                while (left < right && arr[left] <= temp)
                    left++;         //从左往右扫描，找到第一个比基准元素大的元素
                arr[right] = arr[left];  //找到这种元素arr[left]后，与arr[right]交换

            }
            arr[right] = temp;    //基准元素归位
            quickSort(arr, _left, left - 1);  //对基准元素左边的元素进行递归排序
            quickSort(arr, right + 1, _right);  //对基准元素右边的进行递归排序
        }
    }
}
