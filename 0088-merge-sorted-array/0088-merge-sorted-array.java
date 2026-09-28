class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=0;
        int j=0;
        int[] temp = new int[m+n];
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                temp[k++] = nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                temp[k++] = nums2[j];
                j++;
            }
        }
        while(j<n){
            temp[k++] = nums2[j++];
        }
        while(i<m){
            temp[k++] = nums1[i++];
        }
        int l=0;
        for(int num:temp){
            nums1[l++] = num;
        }
    }
}