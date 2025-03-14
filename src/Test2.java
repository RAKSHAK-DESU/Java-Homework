public class Test2 {
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=1;
        int a[]={};
        int p=0;
        for(i=0;i<nums.length;i++){
            for(j=1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    a[0]=i;
                    a[1]=j;
                }
            }
        }
        return a;
    }

}
