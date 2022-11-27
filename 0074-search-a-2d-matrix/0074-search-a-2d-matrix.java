class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
          int l=nums.length;
        Boolean result=false;
        for(int i=0 ; i<l ; i++){
            for(int j=0; j<nums[i].length; j++){
            if(nums[i][j]==target){
                result=true;
                break;
            }}}
        
        return result;
    }}
