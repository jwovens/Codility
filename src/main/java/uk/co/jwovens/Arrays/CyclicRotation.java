package uk.co.jwovens.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by jim on 12/12/16.
 */
public class CyclicRotation {

    public static int[] cycleBy(int[] a, int i) {
        return solution(a, i);
    }

    private static int[] solution(int[] A, int K) {
        return IntStream.range(0, A.length).map(i -> A[(i+K)%A.length]).toArray();
    }

    public static void printIntArray(int[] a) {
        Arrays.stream(a).forEach(i -> System.out.print(i));
        System.out.println();
    }
}
