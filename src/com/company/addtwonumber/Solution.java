package com.company.addtwonumber;

import java.util.LinkedList;

/**
 * 两个链表求和
 */
public class Solution {

    /**
     * 两个链表分别存储两个非负数的各个位数数字（低位到高位），q球两个数字的和
     * <p>
     * 求解思路：遍历较长的一个链表，从各位开始位数相加 乘以10的i次方，将各个位数求解的和相加就能得到最终结果
     * @param l1
     * @param l2
     * @return
     */
    public int add(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        if (l1.size() < l2.size()) {//必须第一个链表比第二个链表长才行
            add(l2, l1);
        } else {
            int num = 0;
            for (int i = 0; i < l1.size(); i++) {
                int data1 = l1.get(i);
                int data2 = 0;
                if (i < l2.size()) {
                    data2 = l2.get(i);
                }
                num += (data1 + data2) * Math.pow(10, i);
            }
            return num;
        }
        return 0;
    }
}
