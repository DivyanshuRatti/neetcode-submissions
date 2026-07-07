class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqCount = new HashMap<>();

        for(int n : nums){
            freqCount.put(n, freqCount.getOrDefault(n, 0) + 1);
        }

        //Making Buckets

        List<List<Integer>> buckets = new ArrayList<>();

        for(int i = 0; i<=nums.length; i++){
            buckets.add(new ArrayList());
        }

        for(Map.Entry<Integer, Integer> count : freqCount.entrySet()){
            int number = count.getKey();
            int frequency = count.getValue();

            buckets.get(frequency).add(number);
        }

        int[] result = new int[k];
        int index = 0;

      for (int frequency = nums.length; frequency >= 0; frequency--) {
            for (int number : buckets.get(frequency)) {
                result[index] = number;
                index++;

                if (index == k) {
                    return result;
                }
            }
        }

        return result;
        
        
    }
}
