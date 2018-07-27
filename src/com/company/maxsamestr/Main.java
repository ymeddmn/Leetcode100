package com.company.maxsamestr;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        if(solution.maxSameStr("aabbaaa")){
//            System.out.println("是回文子串");
//        }else {
//            System.out.println("不是回文子串");
//        }

        String aabbaa = solution.getMaxSameStr("abcdcba");
        System.out.println(aabbaa);
//        System.out.println( "abcd".substring(0,1));
    }
}
