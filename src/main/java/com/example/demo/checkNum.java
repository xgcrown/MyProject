package com.example.demo;
import net.sourceforge.pinyin4j.PinyinHelper;
public class checkNum {
    public static void main(String[] args) {

        String str = "hell,阿莫西林";
        System.out.println(str);
        System.out.println(getPinYinHeadChar(str));
    }

    public static String getPinYinHeadChar(String str) {
        String convert = "";
        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
            if (pinyinArray != null) {
                convert += pinyinArray[0].charAt(0);
            } else {
                convert += word;
            }
        }
        return convert.toUpperCase();
    }
}
