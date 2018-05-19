package www.hackerrank.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = 0;
        for(int i = 0; i<5; i++) {
            sum += arr[i];
            if(arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];

        }
        System.out.print((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}