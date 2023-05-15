class Solution {
    public int[] getConcatenation(int[] nums) {
int ans[]=new int[nums.length*2];

   int i=0;
   for(int j : nums)
   ans[i++]=j;
   for(int j: nums)
   ans[i++]=j;
   return ans;
        
    }
}