class Solution {
    public boolean canJump(int[] nums) {
        int l=nums.length;
        if(l==1)return true;
        int jump=nums[0];
        for(int a=0;a<l;a++){
               jump=max(jump,nums[a]);
               if(jump>0){
                jump--;
                continue;
               }else{
                if(a==l-1)return true;
                return false;
               } 

        
        }
        return true;
    }
    public int max(int a,int b){
       if(a>b) return a;
        return b;
    }
}