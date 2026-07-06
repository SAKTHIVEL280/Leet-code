// 53. Maximum Subarray
// My logic o(n^2) time limit exceeded but the logic is correct
class Solution {
    public int maxSubArray(int[] arr) {
        int l = arr.length;
        int m = arr[0];
        for(int i=0;i<l;i++){
            int ts = 0;
            for(int j=i;j<l;j++){
                ts+=arr[j];
                if(ts>m){
                    m=ts;
                }
            }
        }
        return m;
    }
}

// Actual o(n) logic Kadane's Algorithm
class Solution {
    public int maxSubArray(int[] arr) {
        int l = arr.length;
        int m = arr[0];
        int cs = arr[0];
        for (int i=1;i<l;i++) {
            cs = Math.max(arr[i],cs +arr[i]);
            m = Math.max(m,cs);
        }
        return m;
    }
}
