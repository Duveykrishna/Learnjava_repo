package com.mycompany.app;

public class StringMerger {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while(i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        // if strings are not the same length
        while(i < word1.length()) {
            result.append(word1.charAt(i++));
        }
        while(j < word2.length()) {
            result.append(word2.charAt(j++));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "pqr";
        String result = mergeAlternately(s1, s2);
        System.out.println(result);  // should print "apbqr"

        s1 = "abc";
        s2 = "pqr";
        result = mergeAlternately(s1, s2);
        System.out.println(result);  // should print "apbqcr"
    }
}