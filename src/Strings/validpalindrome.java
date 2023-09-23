package Strings;

public class validpalindrome
{
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s)
    {
        s = s.toLowerCase();

        StringBuilder str = new StringBuilder();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str.append(ch);
            }
        }

        String finstr = str.toString();
        int j = 0;
        int a = finstr.length();
        int m = a - 1;
        while (j < a / 2) {
            if (finstr.charAt(j) != finstr.charAt(m)) {
                return false;
            } else {
                j++;
                m--;
            }
        }
        return true;
    }

}