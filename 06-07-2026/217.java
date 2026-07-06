//217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] arr) {
        boolean f = false;
        int l = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<l-1;i++){
            if(arr[i]==arr[i+1]){
                f=true;
                break;
            }
        }
        return f;
    }
}
