//26. Remove Duplicates from Sorted Array

// Which i solved
class Solution {
    public int removeDuplicates(int[] arr) {
        int l = arr.length;
        /*for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]==arr[j] && arr[i]!=101){
                    arr[j]=101;
                }
            }
        }*/
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
                if(arr[i]==arr[j] && arr[i]!=101){
                    arr[j]=101;
                }
            }
        }
        int c = 0;
        for(int i:arr){
            if(i!=101){
                c++;
            }
        }
        return c;
    }
}

//Idea given by Friend  or the best one
class Solution {
    public int removeDuplicates(int[] arr) {
        int l = arr.length;
        int c =0;
        for(int i=0;i<l;i++){
            if(arr[i]!=arr[c]){
                c++;
                arr[c]=arr[i];
            }
        }
        return c+1;
    }
}
