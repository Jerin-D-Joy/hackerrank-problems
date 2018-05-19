package www.hackerrank.com;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakRecord {

    static int[] breakingRecords(int[] score) {
        int low, high;
        high = low = score[0];
        int [] times = {0,0};
        for(int s : score) {
            if(s > high) {
                ++times[0];
                high = s;
            } else if (s < low) {
                ++times[1];
                low =s;
            }
        }
        return times;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
