package tree.binarytree;

/**
 * Created by lei on 2017/9/26.
 */
public class BinarySearch {

    public static void search(int des, int[] arr, int begin, int end) {

        if (end < begin) {
            System.out.printf("没找到\n");
            return;
        }
//        int binary = (end - begin) / 2 + begin;
        int binary = (end + begin) / 2;

        if (arr[binary] == des) {
            System.out.printf("找到了,index=%d\n", binary);
        } else {
            if (des >= arr[binary]) {
                search(des, arr, binary + 1, end);
            } else {
                search(des, arr, begin, binary - 1);
            }
        }


    }

    public static void search2(int des, int[] arr) {

        int start = 0;
        int end = arr.length;
        while (true) {
            int binary = (start + end) / 2;
            if (binary >= arr.length || binary < 0) {
                System.out.println("没找到");
                break;
            }

            if (arr[binary] == des) {
                System.out.printf("找到了,index=%d\n", binary);
                break;
            } else if (des < arr[binary]) {
                end = binary - 1;
            } else {
                start = binary + 1;
            }

        }


    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 13, 15, 17, 19};
        search(13, arr, 0, arr.length - 1);
        search2(13, arr);
    }


}
