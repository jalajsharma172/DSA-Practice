import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean divideArray(int[] nums) {
        // Create a HashMap to store the frequency of each number
        Map<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each number in the array
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check if every number appears an even number of times
        for(int key : map.keySet()){
            if(map.get(key) % 2 == 1) // If any number appears an odd number of times, return false
                return false;
        }

        // If all numbers appear an even number of times, return true
        return true;
    }
}