import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int l = n + m;

        int arr[] = new int[l];
        int k = 0;

        for(int i = 0; i < n; i++){
            arr[k++] = nums1[i];
        }

        for(int j = 0; j < m; j++){
            arr[k++] = nums2[j];
        }

        Arrays.sort(arr);

        if(l % 2 != 0){
            return arr[l/2];
        }

        return (arr[l/2 - 1] + arr[l/2]) / 2.0;
    }
}