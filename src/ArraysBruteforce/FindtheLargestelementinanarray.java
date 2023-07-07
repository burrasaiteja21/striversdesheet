package ArraysBruteforce;
import  java.util.*;
import java.util.Arrays;

public class FindtheLargestelementinanarray
{
     //1 Brute force
    public static void main(String args[]) {

        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Largest element in the array is: " + sort(arr1));

        int arr2[] =  {8,10,5,7,9};
        System.out.println("The Largest element in the array is: " + sort(arr2));
    }
    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
//    Time Complexity: O(N*log(N))
//
//    Space Complexity: O(n)

    //2 recursion approuch

}