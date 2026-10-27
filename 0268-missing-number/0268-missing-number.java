class Solution {
    public int missingNumber(int[] nums) {
         int n = nums.length;
        int expect = 0;
       for(int num:nums){
           expect^=num;
       }
       int i=1;
       int actual=0;
       while(i<=n){
           actual^=i;
           i++;
       }
       return expect^actual;
    }
}