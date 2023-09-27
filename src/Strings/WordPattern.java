package Strings;
import java.util.*;
public class WordPattern
{

    public static void main(String[] args) {
        String  pattern = "abba", s = "dog cat cat fish";
        System.out.println(wordPattern(pattern,s));

    }
    public static boolean wordPattern(String pattern, String s)
    {

        String[] ss=s.split(" ");
        int n=pattern.length();
        int m=ss.length;


        HashMap<String,String> st=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(st.containsKey(String.valueOf(pattern.charAt(i))))
            {
                if(!st.get(String.valueOf(pattern.charAt(i))).equals(ss[i]))
                {
                    return false;
                }
            }
            else {
                if(st.containsValue(ss[i]))
                {
                    return false;
                }
                st.put(String.valueOf(pattern.charAt(i)),ss[i]);


            }
        }

     return true;
    }

}
