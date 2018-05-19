package www.hackerrank.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        Map<Integer, Integer> countMap = new TreeMap<>();
        for(int num : ar) {
            int count = countMap.getOrDefault(num, 0);
            ++count;
            countMap.put(num, count);
        }
        int maxcount = 0 , max = 6;
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if(entry.getValue() > maxcount) {
                maxcount = entry.getValue();
                max = entry.getKey();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
