package uk.co.jwovens;

import uk.co.jwovens.Arrays.CyclicRotation;
import uk.co.jwovens.Iterations.BinaryGap;

/**
 * Created by jim on 12/12/16.
 */
public class App {
    public static void main(String[] args) {
        // Binary Gap
        BinaryGap n = new BinaryGap();
        System.out.println("Solution is " + n.solution(9));

        // Cyclic Rotation
        int[] a = new int[]{1, 2, 3, 4, 5, 7, 3, 4, 2};
        int[] b = CyclicRotation.cycleBy(a, 122);

        CyclicRotation.printIntArray(a);
        CyclicRotation.printIntArray(b);
    }
}
