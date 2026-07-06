/**
 * Problem:
 * Given two strings s and t, determine whether t is an anagram of s.
 *
 * An anagram is a word or phrase formed by rearranging
 * the letters of another word, using all the original letters exactly once.
 *
 * Return true if t is an anagram of s,
 * otherwise return false.
 *
 * Example:
 *
 * Input:
 * s = "anagram"
 * t = "nagaram"
 * Output:
 * true
 *
 * Input:
 * s = "rat"
 * t = "car"
 * Output:
 * false
 *
 * Data Structure:
 * - HashMap<Character, Integer>
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 */
import java.util.*;

public class ValidAnagram{
    public static boolean isValidAnagram(String s, String t){
        HashMap<Character, Integer> letters = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(char letter : s.toCharArray()){
            if(letters.containsKey(letter)){
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        for(char letter: t.toCharArray()){
            if(!letters.containsKey(letter)){
                return false;
            }
            if (letters.get(letter) == 0) {
                return false;
            }
            letters.put(letter, letters.get(letter) -1);
        }

        for(int value : letters.values()){
            if(value!=0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(isValidAnagram("anagram", "nagaram"));   // true
        System.out.println(isValidAnagram("rat", "car"));           // false
        System.out.println(isValidAnagram("", ""));                 // true
        System.out.println(isValidAnagram("listen", "silent"));     // true
        System.out.println(isValidAnagram("aab", "abb"));           // false
        System.out.println(isValidAnagram("abc", "ab"));            // false
    }
}