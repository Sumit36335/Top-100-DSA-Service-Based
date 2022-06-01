package Arrays;

import java.util.Scanner;

public class Average {

    static void Average9(int []arr) {
         int avg=0,sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
        }
        avg=sum/arr.length;
        System.out.println(avg);
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
        Average9(arr);

    }
}
