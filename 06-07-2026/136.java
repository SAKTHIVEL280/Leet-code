//136. Single Number

class Solution {
    public int singleNumber(int[] arr) {
        int l = arr.length;
        Arrays.sort(arr);

        if (l == 1 || arr[0] != arr[1])
            return arr[0];

        for (int i = 0; i < l - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        return arr[l - 1];
    }
}
