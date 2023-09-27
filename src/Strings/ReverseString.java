package Strings;

public class ReverseString
{
    public static void main(String[] args) {
        String[] s ={"H","a","n","n","a","h"};
        reverseString(s);

    }
    public static void reverseString(String[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            String temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]);
        }
    }
}
