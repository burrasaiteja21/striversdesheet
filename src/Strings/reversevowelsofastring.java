package Strings;

public class reversevowelsofastring
{
    public static void main(String[] args)
    {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s)
    {
         int n=s.length();
         int i=0;
         int j=n-1;
         char[] ch=s.toCharArray();
         while(i<j)
         {
             while(i<j && !isvowel(ch[i]))
             {
                 i++;
             }
             while(i<j && !isvowel(ch[j]))
             {
                 j--;
             }
             if(i<j)
             {
                 char c=ch[i];
                 ch[i++]=ch[j];
                 ch[j--]=c;

             }
         }
         return new String(ch);
    }
    public static boolean isvowel(char ch)
    {
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
        {
            return true;
        }
        return false;
    }
}
