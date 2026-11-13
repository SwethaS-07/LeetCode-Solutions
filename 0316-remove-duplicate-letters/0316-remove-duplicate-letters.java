class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] seen = new boolean[26];
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int idx = current - 'a';

            if (seen[idx]) {
                continue;
            }

            while (stack.length() > 0) {
                char top = stack.charAt(stack.length() - 1);
                if (top > current && lastIndex[top - 'a'] > i) {
                    seen[top - 'a'] = false;
                    stack.deleteCharAt(stack.length() - 1);
                } else {
                    break;
                }
            }

            stack.append(current);
            seen[idx] = true;
        }

        return stack.toString();
    }
}
