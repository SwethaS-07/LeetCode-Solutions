class Solution {
    public boolean isAnagram(String s, String t) {

        int n= s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        char arr1[] = s.toCharArray();
        Arrays.sort(arr1);
        String str1 = String.valueOf(arr1);

        char arr2[] = t.toCharArray();
        Arrays.sort(arr2);
        String str2 = String.valueOf(arr2);

        if(str1.equals(str2)){
            return true;
        }
        return false;
        
    }
}