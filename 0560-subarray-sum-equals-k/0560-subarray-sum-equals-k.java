import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        // Map to store (prefix_sum, frequency_of_this_sum)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base case: a prefix sum of 0 has occurred 1 time (empty subarray)
        map.put(0, 1);
        
        int currentSum = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            // If (currentSum - k) exists in the map, it means a valid subarray exists
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            
            // Record the current prefix sum into the map
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}
