class Solution {
    public String reverseVowels(String s) {

        char[] chars  = s.toCharArray();
        String str = "aeiouAEIOU";
        int i=0;
        int j=chars.length-1;
        while(i<j){
            if(str.indexOf(chars[i])==-1){
                i++;
                continue;
            }
            if(str.indexOf(chars[j])==-1){
                j--;
                continue;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
        
    }
}