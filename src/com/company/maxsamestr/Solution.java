package com.company.maxsamestr;

/**
 * 判断一个字符串是不是回文字符串和查找最大回文子字符串
 */
public class Solution {
    /**
     * 查找一个字符串中的最大回文子串
     *
     * @param str
     * @return
     */
    public String getMaxSameStr(String str) {
        String maxStr = "";
        for (int i = 0; i < str.length(); i++) {
            String maxStrByPosition = getMaxStrByPosition(str, i);
            if (maxStrByPosition.length() > maxStr.length()) {
                maxStr = maxStrByPosition;
            }
        }
        return maxStr;
    }

    /**
     * 以字符串某个位置为中心查找回文子串
     *
     * @param str
     * @param position
     * @return
     */
    public String getMaxStrByPosition(String str, int position) {
        int len = str.length()-1 ;
        int cycleLen = len - position > position ? position : len - position;
        String sameStr = "";
        for (int i = 0; i <= cycleLen; i++) {
            if (str.charAt(position - i) == str.charAt(position + i)) {//如果position位置向左和右偏移i个位置后是回文字符串就赋值给sameStr
                sameStr = str.substring(position - i, position + i+1);
            } else {
                return sameStr;//如果不是就返回当前值
            }
        }
        return sameStr;
    }


    /**
     * 判断一个字符串是不是最回文字符串
     *
     * @param str
     * @return
     */
    public boolean maxSameStr(String str) {
        String reverseStr = getReverseStr(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != reverseStr.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private String getReverseStr(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }
}
