import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] suffixDistinct = new int[n + 1];
        Set<Integer> set = new HashSet<>();

        // suffixDistinct[i] stores distinct elements in nums[i ... n-1]
        for (int i = n - 1; i >= 0; i--) {
            set.add(nums[i]);
            suffixDistinct[i] = set.size();
        }

        int[] diff = new int[n];
        set.clear();

        // Calculate prefix distinct counts and the resulting diff
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            int prefixCount = set.size();
            int suffixCount = suffixDistinct[i + 1]; // distinct count from i + 1 to n - 1
            diff[i] = prefixCount - suffixCount;
        }

        return diff;
    }
}