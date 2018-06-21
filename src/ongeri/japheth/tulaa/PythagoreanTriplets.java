package ongeri.japheth.tulaa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PythagoreanTriplets {

    public PythagoreanTriplets() {
    }

    public boolean findPythagoreanTriplets(List<Integer> distinctIntegers) {
        //Sort the values
        List<Integer> sortedDistinctValues = asSortedList(distinctIntegers);

        int n = sortedDistinctValues.size();
        for (int i = 0; i < n - 2; i++) {
            // Initialize other two elements as corner elements of subarray arr[j+1..k]
            int j = i + 1, k = n - 1;
            // Use Meet in the Middle concept, but only k is moving because we break immediately we find a match
            while (j < k) {
                if (Math.pow(sortedDistinctValues.get(i), 2) + Math.pow(sortedDistinctValues.get(j), 2) == Math.pow(sortedDistinctValues.get(k), 2)) {
                    return true;
                } else {
                    k--;
                }
            }
        }
        return false;
    }

    //A private method to sort values
    private static <T extends Comparable<? super T>> List<T> asSortedList(Collection<T> c) {
        List<T> list = new ArrayList<>(c);
        java.util.Collections.sort(list);
        return list;
    }
}
