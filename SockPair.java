package www.hackerrank.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockPair {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> sockLookup = new HashMap<>();
        for(int num : ar) {
            sockLookup.put(num, sockLookup.getOrDefault(num,0) +1);
        }
        int pairs = 0;
        for(Map.Entry<Integer, Integer> entry : sockLookup.entrySet()) {
            pairs += entry.getValue()/2;
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
