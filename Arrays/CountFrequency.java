package Arrays;

import java.util.Scanner;

public class CountFrequency {
    static void frequency(int[]arr) {
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]== true)
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i]+" "+count);
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
            frequency(arr);
        }


    }

