package Xi.LeetCode.TwoHundredFifty;

/**
 Given an integer, write a function to determine if it is a power of two.

 Example 1:
 Input: 1
 Output: true
 Explanation: 2的0次方 = 1

 Example 2:
 Input: 16
 Output: true
 Explanation: 2的4次方 = 16

 Example 3:
 Input: 218
 Output: false
 */
public class Problem231 {

    public boolean isPowerOfTwo1(int n) {
        if (n == 0) return false;
        while (n%2 == 0) n/=2;
        return n == 1;
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && (n == 1 || (n%2 == 0 && isPowerOfTwo2(n/2)));
    }

    /**
     如果n是2的次方数，n的二进制表示最高位为1，其他是0；n-1的二进制表示是最高位0，其他是1
     */
    public boolean isPowerOfTwo3(int n) {
        return n > 0 && ((n & (n-1)) == 0);
    }

    /**
     1073741824是int范围内最大的2次方数
     */
    public boolean isPowerOfTwo4(int n) {
        return n > 0 && (1073741824 % n == 0);
    }

    /**
     判断n的二进制表示中有几个1
     */
    public boolean isPowerOfTwo5(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }
}
