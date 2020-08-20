package Longest_Substring_Without_Repeating_Characters;

import java.util.HashMap;

public class BruteForceSolution{
    public static int lengthOfLongestSubstring(String s) {
        Character ch;
        int count = 0, strSize = s.length(), lastCollision = 0;
        HashMap<Character, Integer> set = new HashMap<>();
        
        for (int i = 0; i < strSize; i++) {
            ch = s.charAt(i);
            if (set.containsKey(ch)) {
                lastCollision = Math.max(lastCollision, i - set.get(ch));
                lastCollision = Math.max(count, lastCollision);
                set.replace(ch, i);
                count = 0;
            }

            count++;
            set.put(ch, i);
        }
        lastCollision = Math.max(count, lastCollision);
        return lastCollision;
    }

    public static void main(String args[]) {
        System.out.print("Input empty string ");
        System.out.println(lengthOfLongestSubstring(""));
        System.out.print("Input abcabcbb, should output 3, actual output: ");
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.print("Input bbbbb, should output 1, actual output: ");
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.print("Input pwwkew, should output 3, actual output: ");
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.print("Input au, should output 2, actual output: ");
        System.out.println(lengthOfLongestSubstring("au"));
        System.out.print("Input cdd, should output 2, actual output: ");
        System.out.println(lengthOfLongestSubstring("cdd"));
        System.out.print("Input abcabcbb, should output 3, actual output: ");
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}