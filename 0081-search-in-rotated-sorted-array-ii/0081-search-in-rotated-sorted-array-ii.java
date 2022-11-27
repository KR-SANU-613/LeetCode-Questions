class Solution {
    public boolean search(int[] nums, int target) {
        int l=nums.length;
        Boolean result=false;
        for(int i=0 ; i<l ; i++){
            if(nums[i]==target){
                result=true;
                break;
            }
        }
        return result;
    }
}