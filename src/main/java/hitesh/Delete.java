package hitesh;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Delete {

    public static void main(String[] args) {
        System.out.println((int)'z');
        PriorityQueue<String> pq = new PriorityQueue<>((n1,n2) -> n1.compareTo(n2));
        List<Integer> result = new ArrayList<>();
        Integer i = 5;
        Integer j = 5;
//        if(i.equals(j))
//        System.out.println(i.compareTo(j));
    }


    private static List<String> getSubsequences(int start, String s, StringBuilder sb, List<String> result) {
        result.add(sb.toString());
        for (int i = start; i < s.length(); i++) {
            sb.append(s.charAt(i));
            getSubsequences(i + 1, s, sb, result);
            sb.setLength(sb.length() - 1);
        }
        return  result;
    }

    private static int lastIndex(int[] arr, int index, int data) {
        if (index == arr.length)
            return -1;
        int result = lastIndex(arr, index + 1, data);
        if (result != -1)
            return result;
        if (arr[index] == data) {
            return index;
        }
        return lastIndex(arr, index + 1, data);
    }

    private static int firstOccurence(int[] arr, int index, int data) {
        if (index == arr.length)
            return -1;
        if (arr[index] == data)
            return index;
        return firstOccurence(arr, index + 1, data);
    }

//    private static int maxOfArray(int[] arr, int index){
//        if(index == arr.length - 1)
//            return arr[index];
//        return Math.max(maxOfArray(arr, index + 1), arr[index]);
//    }


//
//    private static void printArrayInReverse(int[] arr, int index){
//        if(index < 0)
//            return;
//        System.out.println(arr[index]);
//        printArrayInReverse(arr, index - 1);
//    }
//
//    private static void printArray(int[] arr, int index ){
//        if(index == arr.length)
//            return;
//        System.out.println(arr[index]);
//        printArray(arr, index + 1);
//    }
//
//    private static int pow( int x, int n){
//        if(n == 0)
//            return 1;
//        return x * pow(x, n - 1);
//    }
//
//    private static int factorial(int n) {
//        if (n == 1)
//            return 1;
//        return n * factorial(n - 1);
//    }
//
//    private static void printIncreasingDecreasing(int n) {
//        if (n == 0)
//            return;
//        System.out.println(n);
//        printIncreasingDecreasing(n - 1);
//        System.out.println(n);
//    }
//
//    private static void printIncreasing(int n) {
//        if (n == 1) {
//            System.out.println(n);
//            return;
//        }
//        printIncreasing(n - 1);
//        System.out.println(n);
//    }
//
//    private static void printDecreasing(int n) {
//        if (n == 0)
//            return;
//        System.out.println(n);
//        printDecreasing(n - 1);
//    }
}
