package Xi.LeetCode;

import Xi.UseageOfJDK.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Xi on 2018/5/29.
 */
public class Draft {

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(nums, target, result, list, 0);
        return result;

    }

    public static void backtracking(int nums[], int left, List<List<Integer>> resultList, List<Integer> tempList, int begin) {

        if (tempList.size() == 4 && left == 0)  {
            if (!resultList.contains(tempList)) {
                resultList.add(new ArrayList<>(tempList));
                return;
            }
        }

        for (int i = begin; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtracking(nums, left-nums[i], resultList, tempList, i+1);
            tempList.remove(tempList.size()-1);
        }

    }

    public static void quickSort(int[] array, int low, int high){
        if (array.length <= 1 || low >= high) {
            return;
        }

        int begin = low, end = high;
        int key = array[begin];

        while (begin < end) {
            while (array[end] >= key && begin < end) {
                end--;
            }
            if (begin < end) {
                array[begin] = array[end];
                begin++;
            }
            while (array[begin] <= key && begin < end) {
                begin++;
            }
            if (begin < end) {
                array[end] = array[begin];
                end--;
            }
        }
        array[begin] = key;
        quickSort(array, low, begin - 1);
        quickSort(array, end + 1, high);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(reverse(s));
    }

    public static String reverse(String str) {
        String[] array = str.split(" ");
        int i = 0, j = array.length - 1;
        while (i < j) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++; j--;
        }
        String result = "";
        for (String s : array) {
            result = result +  s + " " ;
        }
        return result;
    }
}
