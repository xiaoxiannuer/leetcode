package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        //System.out.println(map);
        for (int j=0;j<nums.length;j++){
            if (map.containsKey(target-nums[j])&& map.get((target-nums[j]))!=j){
                return new int[]{j,map.get((target-nums[j]))};
            }
        }

        throw new RuntimeException("报错！");
    }
}
