package Arrays;

import java.util.Scanner;

public class SacondSmallAndLargest {

    public static int SecondSmallest(int[] arr)
    {
        if(arr.length<2)
        {
            return -1;
        }
        int sec_small=Integer.MAX_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<small)
            {
                sec_small=small;
                small=arr[i];
            }
            else if(arr[i]<sec_small && arr[i]!=small)
            {
                sec_small=arr[i];
            }
        }
        return sec_small;
    }
//    public static int SecondLargest(int[] arr)
//    {
//        if(arr.length<2)
//        {
//            return -1;
//        }
//        int sec_large=Integer.MIN_VALUE;
//        int large=Integer.MIN_VALUE;
//        for(int i=0;i< arr.length;i++)
//        {
//            if(arr[i]>large)
//            {
//                sec_large=large;
//                large=arr[i];
//            }
//            else if(arr[i]>sec_large && arr[i]!=large)
//            {
//                sec_large=arr[i];
//            }
//        }
//        return sec_large;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of Elements");
//        int n =sc.nextInt();
//        int[] arr= new int[n];
        int arr[]={1,2,4,7,7,5};
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }

        int small= SecondSmallest(arr);
        System.out.println("Your Second Smallest Number is "+small);

//        int large= SecondLargest(arr);
//        System.out.println("Your Second Large Number is "+large);
    }
}
