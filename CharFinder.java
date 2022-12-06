package com.vishnu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    Map<Character, Integer> map = new HashMap<>();

    public void basic(String str) {
        for (var item : str.toCharArray()) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else
                map.put(item, 1);
        }

    }

    public char firstNonRepeatingChar(String str) {
        basic(str);
        System.out.println(map);
        for (var item : str.toCharArray()) {
            if (map.get(item) == 1)
                return item;
        }
        return 0;
    }

    public char findFirstRepeatedCharacter(String str){
        Set<Character> set = new HashSet<>();
        for (var item : str.toCharArray()){
            if (set.contains(item)){
                return item;
            }
            set.add(item);
        }
        return 0;
    }
}