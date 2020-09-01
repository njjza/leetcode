package Longest_Substring_Without_Repeating_Characters;

import java.util.HashMap;

public class SlidingWindow{
    public static int lengthOfLongestSubstring(String s) {
        Character ch;
        int count = 0, strSize = s.length(), maxLen = 0;
        int collisionLen, lastCollision = -1, curCollision = 0;
        HashMap<Character, Integer> set = new HashMap<>();
        
        for (int i = 0; i < strSize; i++) {
            ch = s.charAt(i);
            if (set.containsKey(ch)) {
                curCollision  = set.get(ch);

                if (curCollision > lastCollision) {
                    collisionLen = i - set.get(ch);
                    maxLen = Math.max(count, maxLen);
                    count = collisionLen - 1;
                    lastCollision = set.get(ch);
                }

                set.replace(ch, i);
            }

            count++;
            set.put(ch, i);
        }

        return Math.max(maxLen, count);
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
        System.out.print("Input abba, should output 2, actual output: ");
        System.out.println(lengthOfLongestSubstring("abba"));
    }
}