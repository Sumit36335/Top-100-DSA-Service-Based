package Arrays;

import java.util.Scanner;

public class RemoveDuplicates {

    static  int Duplicates(int [] arr)
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of Elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = Duplicates(arr);
        for(int i=0;i<k;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
