class Solution {
    public long coloredCells(int n) {
        //1 +4 +8 +12+16.
         long sum=1;
          for(int a=1;a<n;a++){
            // System.out.println(sum);
            sum+=4*a;
          } 

          return sum;
    }
}