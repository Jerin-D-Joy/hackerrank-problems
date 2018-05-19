package www.hackerrank.com;

import java.util.HashMap;
import java.util.Scanner;

public class SequenceEquation {


    static int[] permutationEquation(int[] p) {
        HashMap<Integer, Integer> valuePosMap = new HashMap<>(p.length);
        for (int i = 0; i<p.length; i++) {
            valuePosMap.put(p[i], i+1);
        }
        int[] result = new int[p.length];
        for(int i = 1; i<=p.length; i++) {
            result[i-1] = valuePosMap.get(valuePosMap.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for (int p_i = 0; p_i < n; p_i++) {
            p[p_i] = in.nextInt();
        }
        int[] result = permutationEquation(p);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }

}
