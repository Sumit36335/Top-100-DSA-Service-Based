package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {

    public static int Largest(int[] arr)
    {
        // 1. approach  o(n*logn)
//                       int ans;
//                       Arrays.sort(arr);
//                       return arr[arr.length-1];

        //2. approach    o(n)
                        int ans=arr[0];
                        for(int i=0;i< arr.length;i++)
                        {
                               if(arr[i]>ans)
                               {
                                  ans=arr[i];
                               }
                         }
                         return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of Elements");
        int n =sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int small= Largest(arr);
        System.out.println("Your Largest Number is "+small);
    }
}
