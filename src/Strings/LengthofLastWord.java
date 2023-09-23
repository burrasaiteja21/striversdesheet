package Strings;
import java.util.*;
public class LengthofLastWord {
    public static void main(String[] args) {
      String s = "Hello World";
        System.out.println(lengthOfLastWord(s));

    }
    public static int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        Stack<String> sst=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==" ")
            {
                continue;
            }
            else{
                sst.push(arr[i]);
            }
        }
        String a=sst.pop();
        return a.length();
    }
}