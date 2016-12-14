package uk.co.jwovens.Iterations;

import java.util.Arrays;

/**
 * Created by jim on 12/12/16.
 */

// Binary gap is longest sequence of zeros in a binary representation of a number
// e.g. 9 (1001) has binary gap of 2
//      529 (1000010001) has binary gap of 4
public class BinaryGap {

    public int solution(int N) {
        return getMax(Integer.toBinaryString(N).split("[\\^1\\$]"));
    }

    private int getMax(String[] tokens) {

       return (tokens.length > 0)?
             Arrays.stream(tokens)
                     .map(a -> a.length())
                     .mapToInt(Integer::intValue)
                     .max()
                     .getAsInt()
               :0;
    }
}
