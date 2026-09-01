class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        ArrayList<String> str = new ArrayList<>();

        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {

                if (list1[i].equals(list2[j])) {

                    int sum = i + j;

                    if (sum < minSum) {
                        minSum = sum;
                        str.clear();
                        str.add(list1[i]);
                    }
                    else if (sum == minSum) {
                        str.add(list1[i]);
                    }
                }
            }
        }

        return str.toArray(new String[0]);
    }
}