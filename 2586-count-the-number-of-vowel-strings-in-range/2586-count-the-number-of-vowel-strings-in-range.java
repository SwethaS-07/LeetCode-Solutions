class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String chars = "aeiouAEIOU";
        int count=0;

        for(int i=left;i<=right;i++){

            String w = words[i];
            char first = w.charAt(0);
            char last = w.charAt(w.length() - 1);

            // Check if both the first and last characters are vowels
            if (chars.indexOf(first) != -1 && chars.indexOf(last) != -1) {
                count++;
            }

        }
        return count;
        
    }
}