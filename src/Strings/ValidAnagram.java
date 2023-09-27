package Strings;
import java.util.*;
public class ValidAnagram
{
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s, String t)
    {
        int n=s.length();
        int m=t.length();
        if(n!=m)
            return false;
        HashMap<Character,Integer> map = new HashMap<>();
        int j=0;
        while(j<n)
        {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            j++;
        }
        for(int i=0;i<m;i++){
            if(map.containsKey(t.charAt(i))==true){
                int temp=map.get(t.charAt(i));
                temp--;
                map.put(t.charAt(i),temp);
            }
            else{
                return false;
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=0)
                return false;
        }
        return true;
    }
}

