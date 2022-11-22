class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int ans[]=new int[2];
        int c=0;
        for(int i=0 ; i < n ;i++){
            if (nums[i]==target){
                ans[0]=i;
                c++;
                break;
            }
        }
        for(int i=(n-1) ; i>=0 ; i--){
            if(nums[i]==target){
                ans[1]=i;
                c++;
                break;
            }
        }
        if(c==0){
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;
    }
}