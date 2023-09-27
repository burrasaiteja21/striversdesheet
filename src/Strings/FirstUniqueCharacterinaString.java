package Strings;
import java.util.*;
public class FirstUniqueCharacterinaString
{
    public static void main(String[] args)
    {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    public static  int firstUniqChar(String s)
    {
        int w=-1;
        HashMap<Character, Integer> charFrequency = new HashMap<>();

        //HashMap<Character,Integer> ma=new HashMap<>();
        for (char ch : s.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        //  boolean le=true;
        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charFrequency.get(s.charAt(i)) == 1) {
                w = i;
                break;
            }
        }
        return w;
    }
}