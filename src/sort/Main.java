package sort;

public class Main {
    public static void main(String[] args) {
        SortService sort = new Quick();
        int[] arr = {2, 5, 3, 8, 6, 4, 9, 7};
        ArrayUtils.print("排序前", arr);
        sort.sort(arr);
        ArrayUtils.print("排序后", arr);

    }


}
