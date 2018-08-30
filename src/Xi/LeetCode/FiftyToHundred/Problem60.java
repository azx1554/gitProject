package Xi.LeetCode.FiftyToHundred;


import java.util.ArrayList;
import java.util.List;

/**
 * The set [1,2,3,...,n] contains a total of n! unique permutations.
 * <p>
 * By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
 * <p>
 * "123"<br>
 * "132"<br>
 * "213"<br>
 * "231"<br>
 * "312"<br>
 * "321"<br>
 * Given n and k, return the kth permutation sequence.<br>
 * <p>
 * Note:
 * <p>
 * Given n will be between 1 and 9 inclusive.<br>
 * Given k will be between 1 and n! inclusive.<br>
 * Input: n = 3, k = 3<br>
 * Output: "213"
 */
public class Problem60 {

    public static String getPermutation(int n, int k) {
        String result = "";

        int[] factorial = new int[n + 1];
        factorial[0] = 1;

        int i;

        for (i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        List numbers = new ArrayList();
        for (i = 1; i <= n; i++) {
            numbers.add(i);
        }

        i = n;

        /**
         * 这里运用了一个很巧妙的技巧，当有均匀分布的几个分组，通过元素的位置来获取元素所在的组时（元素位置从1计数，
         * 组位置从0计数），可先把位置减一再除以组的元素个数向下取整即可
         *
         */
        while (i > 0) {
            int index = k % factorial[i - 1] == 0 ? (k / factorial[i - 1] - 1) : (k / factorial[i - 1]);
            result += numbers.get(index);
            numbers.remove(index);
            k -= index * factorial[i - 1];
            i--;
        }

        return result;
    }

    public static void main(String[] args) {
        getPermutation(3,3);
    }
}
