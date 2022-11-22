class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
      int m=1;
        int z=0; 
        for(int i=0 ; i<n ; i++){
            if(nums[i]==0){
                z++;
            }
            else{
                m*=nums[i];
            }
        }
        if(z==0){
            for(int i=0 ; i< n ; i++){
                nums[i]=m/nums[i];
            }
        } else if(z==1){
            for(int i=0 ; i< n ; i++){
                if(nums[i]==0){
                    nums[i]=m;
                } else{
                    nums[i]=0;
                }
            }
        }
        else{
             for(int i=0 ; i< n ; i++){
                nums[i]=0;
            }
        }
        return nums;
    }
}