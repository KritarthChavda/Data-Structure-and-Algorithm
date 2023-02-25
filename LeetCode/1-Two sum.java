class Solution {
    public int[] twoSum(int[] nums, int target) {
        //now instead of finding two numbers that add up to the target 
        //what we do is , we iterate once in the array and calculate the
        //target - the integer and put the integer and its index in the hash map
        //now if the complement is in the hash map
        //we found our answer ( the element we are on and the index from the hash map )
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
