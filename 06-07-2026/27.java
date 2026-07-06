//27. Remove Element

class Solution {
    public int removeElement(int[] arr, int val) {
        int l = arr.length;
        for(int i =0;i<l;i++){
            if(arr[i]==val && arr[l-1]!=val){
                int temp = arr[i];
                arr[i] = arr[l-1];
                arr[l-1] = temp;
                l--;
            }
            else if(arr[i]==val && arr[l-1]==val){
                l--;
                i--;
            }
        }
        return l;
    }
}
