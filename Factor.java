package www.hackerrank.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factor {

    static int getTotalX(int[] a, int[] b) {
        int max_a = 0;
        for(int num : a) {
            if(num > max_a)
                max_a = num;
        }
        int min_b = Integer.MAX_VALUE;
        for(int num : b) {
            if(num < min_b)
                min_b = num;
        }
        if(max_a > min_b)
            return 0;
        int count = 0;
        checkDivision :
        for(int i = max_a; i <= min_b; i++) {
            for(int n : a) {
                if(i%n != 0)
                    continue checkDivision;
            }
            for (int n : b) {
                if(n%i != 0)
                    continue checkDivision;
            }
            ++count;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}