// 217. Contains Duplicate 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> checked = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(checked.contains(nums[i]))
            {
                return true; 
            }
            checked.add(nums[i]);
        }
        return false;
    }
}
