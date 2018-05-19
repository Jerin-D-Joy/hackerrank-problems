package www.hackerrank.com;

import java.util.Scanner;

public class JumpingClouds {
    static int jumpingOnClouds(int[] c, int k) {
        int i = 0, e = 100;
        do {
            if(c[i] == 1) {
                e-=2;
            }
            e-=1;
            i=(i+k)%c.length;
        } while(i!=0 || e==0);
        return e;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }
}
