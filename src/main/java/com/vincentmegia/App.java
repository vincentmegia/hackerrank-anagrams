package com.vincentmegia;

import java.util.HashMap;
import java.util.Map;

/**
 * To check if two strings are anagrams you must count the frequencies of each character
 * Approach here is that the first string loop we assign positive value of character key
 * in map
 * second loop we if character is in map then we subtract.
 * This will result in matching characters will have 0 values in map
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String string1 = "cde";
        String string2 = "abc";
        Map<Character, Integer>  map = new HashMap<>();
        for (Character character: string1.toCharArray()) {
            int value = map.containsKey(character) ? map.get(character) : 0;
            map.put(character, value + 1);
        }
        for (Character character: string2.toCharArray()) {
            int value = map.containsKey(character) ? map.get(character) : 0;
            map.put(character, value - 1);
        }
        int total = 0;
        for (int value : map.values()) {
            total += Math.abs(value);
        }
        //if total == 0, then string is anagrams
    }
}
