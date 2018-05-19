package www.hackerrank.com;

import java.util.Scanner;

public class CatAndMouse {

    static String catAndMouse(int x, int y, int z) {
        int disA = Math.abs(z-x);
        int disB = Math.abs(z-y);
        if(disA == disB)
            return "Mouse C";
        else if(disA > disB)
            return "Cat B";
        else return "Cat A";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int i = 0;
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println(catAndMouse(x, y, z));

        }
        in.close();
    }
}
