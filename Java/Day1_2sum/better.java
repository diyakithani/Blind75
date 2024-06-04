class better{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (hm.containsKey(k)) {
                return new int[] {hm.get(k), i};
            }
            hm.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
