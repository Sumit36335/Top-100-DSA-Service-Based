package Arrays;

import java.util.Scanner;

public class RemoveUnsortedDuplicate {
    static void duplicate(int[] arr) {
        int[] mark = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            mark[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (mark[i] == 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        mark[j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (mark[i] == 1) {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of Elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        duplicate(arr);
    }
}
