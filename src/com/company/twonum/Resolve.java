package com.company.twonum;

import java.util.Arrays;

/**
 * 给定一个数组，找出数组中所有相加等于指定数值的两项
 */
public class Resolve {

    public static class Result implements Comparable<Result> {
        int index;
        int value;

        public Result(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Result o) {
            return value - o.value;
        }
    }


    public void getSum(int[] nums, int target) {
        Result[] results = new Result[nums.length];//将数组封装成一个新的Result数组
        for (int i = 0; i < results.length; i++) {
            results[i] = new Result(i, nums[i]);
        }
        int indexs[] = new int[2];
        Arrays.sort(results);//对Result数组进行排序
        int start = 0;
        int end = results.length - 1;
        while (start < end) {//从数组两边开始查找
            Result startValue = results[start];
            Result endValue = results[end];
            int numValue = startValue.value + endValue.value;
            if (numValue == target) {//如果值相等输出数组下标，
                indexs[0] = Math.min(startValue.index, endValue.index);
                indexs[1] = Math.max(startValue.index, endValue.index);
                System.out.println(indexs[0] + "," + indexs[1]);
                if (startValue.value == results[start + 1].value) {//如果start的下一个元素==start元素 那么start++
                    start++;
                } else if (endValue == results[end - 1]) {//如果end的下一个元素==end元素  那么end--
                    end--;
                } else {//end--
                    end--;
                }
            } else if (numValue > target) {//如果大于target  end--
                end--;
            } else {//如果小于target  start++
                start++;
            }
        }
    }
}
