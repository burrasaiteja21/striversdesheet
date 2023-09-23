package Strings;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args)
    {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle)
    {
        int i=0;
        int j=0;
        int k=j;
        int n=haystack.length();
        int m=needle.length();
        while(i<n && j<m)
        {
            if(haystack.charAt(i) == needle.charAt(j))
            {
                i++;
                j++;
            }
            else
            {

                i=i-j+1;
                j=0;

            }
        }
        if(j==m)
        {
            return j-j;
        }
        return -1;

    }
}
