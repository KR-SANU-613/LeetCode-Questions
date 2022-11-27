class Solution {
    public int findMin(int[] arr) {
          int l=arr.length;
        int max=arr[0];
        int a=0;
        for(int i=0 ; i<l ;   i++){
            if (max>arr[i]){
                max=arr[i];
                
            }
          
        }
        return max;
    }
}