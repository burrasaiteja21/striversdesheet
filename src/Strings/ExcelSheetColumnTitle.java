package Strings;
import java.util.*;
public class ExcelSheetColumnTitle
{
    public static void main(String[] args) {
        int columnNumber = 1;
        System.out.println(convertToTitle(columnNumber));

    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        int n=columnNumber;
        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }

        return result.toString();
    }
}
