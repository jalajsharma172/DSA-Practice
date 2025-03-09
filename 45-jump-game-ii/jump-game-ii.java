class Solution {
    public int jump(int[] nums) {
     int jump=0,l=0,r=0;
     while(r<nums.length-1){
        int farthest=0;
        for(int a=l;a<=r;a++)farthest=Math.max(farthest,nums[a]+a);
        l=r+1; r=farthest;
        jump++;
     }
     return jump;   
    }
}