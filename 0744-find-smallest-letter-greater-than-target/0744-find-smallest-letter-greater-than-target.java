class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int t = target;
        for(int i=0;i<letters.length;i++){
            int ch = letters[i];
            if(ch>t){
                return letters[i];
            }
        }
        return letters[0];
        
    }
}