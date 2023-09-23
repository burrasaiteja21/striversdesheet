package Strings;
import java.util.*;
public class ValidParentheses {

    public static void main(String[] args)
    {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s)
    {
        Stack<Character> stk= new Stack<>();
        int n=s.length();
        for(char ch : s.toCharArray()){
            if(stk.empty())
                stk.push(ch);
            else if(stk.peek() == '(' && ch == ')')
                stk.pop();
            else if(stk.peek() == '{' && ch == '}')
                stk.pop();
            else if(stk.peek() == '[' && ch == ']')
                stk.pop();
            else
                stk.push(ch);
        }
        if(stk.empty())
            return true;
        return false;
    }
}

