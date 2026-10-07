class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        for (int key : count.keySet()) {
            if (count.get(key) > nums.length / 3) {
                result.add(key);
            }
        }
        
        return result;
    }
}
