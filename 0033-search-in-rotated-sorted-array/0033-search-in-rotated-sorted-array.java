class Solution {
    public int search(int[] nums, int target) {
        int l=nums.length;
        int index=9999;
        for(int i=0 ; i< l; i++){
            if(nums[i]==target){
                index=i;
            }
        }
        if(index!=9999){
            return index;
        }
        else return -1;
    }
}