package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    static   void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int []arr, int start,int end)
    {
        if(start<end)
        {
            swap(arr,start,end);
            reverse(arr,start+1,end-1);
        }
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
        int start=0;
        int end=n-1;
        reverse(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }

}
