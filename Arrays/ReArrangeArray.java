package Arrays;

import java.util.Collection;
import java.util.Scanner;
import java.util.Arrays;

public class ReArrangeArray {

    static void rearrange(int []arr)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        for(int i= arr.length-1;i>=arr.length/2;i--)
        {
            System.out.print(arr[i]+" ");
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
        rearrange(arr);

    }
}