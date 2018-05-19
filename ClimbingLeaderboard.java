package www.hackerrank.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class ClimbingLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int temp=-1, i = 0;
        int ptr = Integer.MAX_VALUE;
        int[] unique = new int[scores.length];
        for(int s : scores) {
            if (temp!=s) {
                  unique[i] = s;
                  temp = s;
                  ++i;
            }
        }
        int j = i-1;
        int[] output = new int[alice.length];
        int k=-1;
        for (int m = 0; m < alice.length; m++) {
            k = j;
            while (k>=0) {
                if (alice[m] < unique[k]) {
                    output[m] = k+2;
                    j = k;
                    break;
                }
                else if(alice[m] == unique[k]) {
                    output[m] = k+1;
                    j = k;
                    break;
                }
                --k;
            }

            if(k<0 && m<alice.length) {
                ptr = m;
                break;
            }
        }
        for(int p = ptr; p<alice.length; p++ ) {
            output[p] = 1;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        int[] result = climbingLeaderboard(scores, alice);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
