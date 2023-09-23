package basicmaths;

public class Findthenumberofdigitsofnthatevenlydividen {
    public static void main(String args[])
    {
        int n=336;
        System.out.println(countDigits(n)+" ");
    }
    public static int countDigits(int n)
    {
       int count=0;
        int value=n;
        while(value>0)
        {
            int rem=value%10;
            if(rem!=0)
            {
                if(n%rem==0)
                {
                    count++;
                }
            }
            value=value/10;
        }
        return count;
    }
}
