package MCMDP;

public class PalindromePartitioningDP53
{
    public static void main(String[] args) {
        String str = "aab";
        int partitions = palindromePartitioning(str);
        System.out.println("The minimum number of partitions: " + partitions);
    }
    public static int palindromePartitioning(String st)
    {
        int n=st.length();
        return function(0,n,st)-1;
    }
    public static int function(int in,int n,String st)
    {
        if(in==n)
        {
            return 0;
        }
        int solve=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int j=in;j<n;j++)
        {
            if(ispalindrom(st,in,j))
            {
                solve=1+function(j+1,n,st);
                min=Math.min(min,solve);

            }
        }
        return min;
    }
    public static boolean ispalindrom(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

      return true;
    }
}

// function code explanation
//                        f(0, 3, "aab")
//                             j = 0
//                            /   \
//                     True /       \ False
//                         /         \
//                cost = 1      f(1, 3, "aab")
//                                   j = 1
//                                   /   \
//                            True /       \ False
//                                /         \
//                            cost = 1      f(2, 3, "aab")
//                                               j = 2
//                                              /   \
//                                        True /       \ False
//                                            /         \
//                                     cost = 1      f(3, 3, "aab")
//                                                       (Base Case)
//
//                            (Return 2)

//Time Complexity: Exponential

//Do memorization ,tabulation and space optimization


// memorization:
//Time Complexity: O(N2)
//        Reason: There are a total of N states and inside each state, a loop of size N(apparently) is running.
//
//        Space Complexity: O(N) + Auxiliary stack space O(N)
//        Reason: The first O(N) is for the dp array of size N.



// ,tabulation
//Time Complexity: O(N2)
//        Reason: There are a total of N states and inside each state a loop of size N(apparently) is running.
//
//        Space Complexity: O(N)
//        Reason: O(N) is for the dp array we have used.
