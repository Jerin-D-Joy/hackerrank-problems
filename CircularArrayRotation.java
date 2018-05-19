package www.hackerrank.com;

import java.util.Scanner;

public class CircularArrayRotation {

    /*
3 1 2, 2 3 1
    3 2 3
1 2 3
0
1
2

0 1 2 3 4
4 0 1 2 3
3 4 0 1 2
2 3 4 0 1
     */

    static int[] circularArrayRotation(int[] a, int[] m, int k) {
      /*  int n = a.length;
        int start =   k%n;
        int rotations = m.length;
        int offsets[] = new int[rotations];
        int offset;
        for(int i = start, j = 0; j< n;i++,  j++) {
            //offset = (start + m[i])%n;
            i = i%n;
            offsets[i] = a[j];
        }
        int values[] = new int[rotations];
        for(int j=0; j<rotations; j++) {
            values[j] = a[(n-start+k)%n];
        }
        return offsets;*/
        int n = a.length;
        int start =   k%n;
        int offsets[] = new int[m.length];
        for(int j=0; j<m.length; j++) {
            offsets[j] = a[(n-start+m[j])%n];
        }
        return offsets;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            m[m_i] = in.nextInt();
        }
        int[] result = circularArrayRotation(a, m, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
