//package www.hackerrank.com;
//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class PickingNumbers {
//    static int pickingNumbers(int[] a) {
//        Arrays.sort(a);
//        Map<Integer,Integer> lookup = new HashMap<>();
//        for(int i : a) {
//            lookup.put(i, lookup.getOrDefault(i, 1)+1);
//        }
//        Map.Entry<Integer,Integer> maxEntry = null;
//        for (Map.Entry<Integer,Integer> entry : lookup.entrySet()) {
//            if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
//                maxEntry = entry;
//        }
//        lookup.remove();
//        maxEntry.getKey();
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] a = new int[n];
//        for(int a_i = 0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
//        int result = pickingNumbers(a);
//        System.out.println(result);
//        in.close();
//    }
//}
