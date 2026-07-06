// 283. Move Zeroes
class Solution {
    public void moveZeroes(int[] arr) {
        int l = arr.length;
        int temp[] = new int[l];
        int c = l-1;
        int in = 0;
        for(int i=0;i<l;i++){
            if(arr[i]==0){
                temp[c]=0;
                c--;
            }
            else{
                temp[in]=arr[i];
                in++;
            }
        }
        for(int i=0;i<l;i++){
            arr[i]=temp[i];
        }
    }
}
