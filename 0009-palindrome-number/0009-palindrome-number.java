class Solution {
    public boolean isPalindrome(int n) {
      int sum = 0, r;
	 int temp = n;    
     while(n>0)
	   {    
        r = n % 10;   
        sum = (sum*10)+r;    
        n = n/10;    
       }    
      if(temp==sum)    {
          return true;
      }else{
          return false;
      }
        }
    }
