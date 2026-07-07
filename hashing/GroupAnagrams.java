/**
 * Problem:
 * Given an array of strings, group the strings that are anagrams
 * of each other.
 *
 * An anagram is a word or phrase formed by rearranging
 * the letters of another word, using all the original letters exactly once.
 *
 * Return a list of groups, where each group contains
 * strings that are anagrams of one another.
 *
 * Example:
 *
 * Input:
 * ["eat", "tea", "tan", "ate", "nat", "bat"]
 *
 * Output:
 * [
 *   ["eat", "tea", "ate"],
 *   ["tan", "nat"],
 *   ["bat"]
 * ]
 *
 * Input:
 * ["abc"]
 *
 * Output:
 * [
 *   ["abc"]
 * ]
 *
 * Data Structure:
 * - HashMap<String, ArrayList<String>>
 *
 * Time Complexity:
 * O(n * k log k)
 * n = number of words
 * k = maximum word length
 *
 * Space Complexity:
 * O(n * k)
 */
import java.util.*;

public class GroupAnagrams{

    private static String sortWord(String word){
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }

    public static  ArrayList<ArrayList<String>> groupAnagrams(String[] words){
        HashMap<String, ArrayList<String>> groups = new HashMap<>();
        
        for(String word: words){
            String key = sortWord(word);

            if(!groups.containsKey(key)){
                groups.put(key, new ArrayList<String>());
            }
            groups.get(key).add(word);
        }

        ArrayList<ArrayList<String>> listGroups = new ArrayList<>();

        for(ArrayList<String> group : groups.values()){
            listGroups.add(group);
        }

        return listGroups;
    }

   
    public static void main(String[] args){
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));
        System.out.println(groupAnagrams(new String[]{"abc"}));
        System.out.println(groupAnagrams(new String[]{"a"}));
        System.out.println(groupAnagrams(new String[]{"", ""}));
    }
}