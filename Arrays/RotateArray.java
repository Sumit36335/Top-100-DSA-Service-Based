package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void reverse(int[] arr,int start,int end){
        for(int i= start ;i<=end;i++,end--)
        {
            int temp =  arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
        };
    }
    static void rotate(int [] arr,int k)
    {
        k=k%arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
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
        int k = sc.nextInt();
        rotate(arr,k);
        System.out.println(Arrays.toString(arr)+"");
    }
}
