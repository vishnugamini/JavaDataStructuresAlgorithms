package com.vishnu;

public class AlternateMerge {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int first = 0, second= 0;

        while(first < word1.length() || second < word2.length()) {
            if (first < word1.length())
                merge.append(word1.charAt(first));
            if (second < word2.length())
                merge.append(word2.charAt(second));
            first++;
            second++;
        }

        return merge.toString();
    }
    public static void main(String[] args) {
        AlternateMerge a = new AlternateMerge();
        System.out.println(a.mergeAlternately("aaav","bbbcc"));
    }
}
