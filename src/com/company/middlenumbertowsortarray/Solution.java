package com.company.middlenumbertowsortarray;

/**
 * 查找两个有序数组的中位数
 */
public class Solution {


    public int method1(int array1[], int array2[]) {
        return method1(array1, 0, array1.length - 1, array2, 0, array2.length);
    }

    private int method1(int array1[], int s1, int e1, int array2[], int s2, int e2) {
        int index1 = (e1 + s1) / 2;
        int index2 = (e2 + s2) / 2;
        int m1 = array1[index1];
        int m2 = array2[index2];
        if (m1 == m2) {
            return m1;
        } else if (m1 < m2) {
            return method1(array1, index1 + 1, e1, array2, s2, index2 - 1);
        } else {
            return method1(array2, index2 + 1, e2, array1, s2, index2 - 1);
        }
    }
}
