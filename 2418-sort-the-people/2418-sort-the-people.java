import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        // Create an array of indices
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        // Sort indices based on heights (descending)
        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);

        // Build result array
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = names[idx[i]];
        }

        return result;
    }
}