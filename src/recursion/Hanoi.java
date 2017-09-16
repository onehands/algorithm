package recursion;

/**
 * Created by lei on 2017/9/17.
 */
public class Hanoi {

    private static volatile int count = 0;


    /**
     * 总体思想就是，把第1-(n-1)个移动到tmp位，然后把第n个（最大的）移动到to位，然后把第1-(n-1)个从tmp移动到to
     *
     * @param num
     * @param from
     * @param tmp
     * @param to
     */

    public static void move(int num, char from, char tmp, char to) {
        count++;
        if (num == 1) {
            //只有一个
            System.out.println("从" + from + " 移动盘子" + num + " 号到" + to);
        } else {
            //只有两个
            move(num - 1, from, to, tmp);
            System.out.println("从" + from + " 移动盘子" + num + " 号到" + to);
            move(num - 1, tmp, from, to);
        }
    }

    public static void main(String[] args) {
        move(12, 'A', 'B', 'C');
        System.out.println("移动了：" + count);
    }


}
