package com.company.addtwonumber;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        LinkedList<Integer> l1=new LinkedList<Integer>();
        LinkedList<Integer> l2=new LinkedList<Integer>();

        l1.add(1);
        l1.add(2);
        l1.add(3);


        l2.add(1);
        l2.add(2);
        int add = solution.add(l1, l2);
        System.out.println(add);
    }
}
