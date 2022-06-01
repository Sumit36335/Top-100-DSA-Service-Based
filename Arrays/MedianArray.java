package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class MedianArray {
    static  void Median(int [] arr) {
        Arrays.sort(arr);
        int median=0;
        if (arr.length % 2 == 0)
        {

          median=(arr.length/2)+1;
        }
        else
        {
            median=(arr.length/2);
        }
        System.out.println(arr[median]);
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
        Median(arr);

    }
}