import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new HashMap<>();
        
        // Pair heights with names
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        
        // Sort heights in ascending order
        Arrays.sort(heights);
        
        String[] result = new String[n];
        int index = 0;
        
        // Populate result in descending order by traversing backwards
        for (int i = n - 1; i >= 0; i--) {
            result[index++] = map.get(heights[i]);
        }
        
        return result;
    }
}
