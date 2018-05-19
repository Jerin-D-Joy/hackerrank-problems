package www.hackerrank.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        long total = arr.length;
        int zero = 0;
        int pos= 0;
        int neg = 0;
        for(int num : arr) {
            if(num == 0)
                ++zero;
            else if(num > 0)
                ++pos;
            else ++neg;
        }
        System.out.print((long) pos/total + "\n" + neg/total + "\n" + zero/total);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}