class optimal{
    public int[] twoSum(int[] nums, int target) {
        int low = 0; // two pointers
        int high = nums.length - 1;
        // Create an array to store the original indices
        Integer[] indices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }
        // Sort the indices array based on the values in nums
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));

        // Apply the two-pointer technique
        while (low < high) {
            int sum = nums[indices[low]] + nums[indices[high]];
            if (sum == target) {
                // Return the original indices
                return new int[] {indices[low], indices[high]};
            }
            if (sum > target) {
                high--;
            } else {
                low++;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
