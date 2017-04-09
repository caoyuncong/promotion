package day01;

/**
 * Created by caoyuncong on
 * 2017/4/9 19:27
 * promotion.
 */
public class ArrayTest {
    public static void print(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
        System.out.println();
    }

    static void sort(int[] a, int low, int high) {
        if (low >= high) {
            return; // low 小于 high
        }
        if ((high - low) == 1) {
            if (a[0] > a[1]) {
//                swap(a, 0, 1);
                return;
            }
        }
        int pivot = a[low]; //
        int left = low + 1;
        int right = high;

        while (left < right) {
//            while ()
        }

    }
}