package Strings;

public class ExcelSheetColumnNumber
{
    public static void main(String[] args) {
        String columnTitle = "A";
        System.out.println(titleToNumber(columnTitle));

    }
    public static int titleToNumber(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i==0){
                ans=ans+((int)(s.charAt(i))-64);
            }
            else{
                ans=(ans*26)+((int)(s.charAt(i))-64);
            }
        }
        return ans;
    }

}
