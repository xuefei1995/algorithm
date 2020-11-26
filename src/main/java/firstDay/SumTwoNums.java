package firstDay;


/*给定 nums = [2, 7, 11, 15], target = 9

        因为 nums[0] + nums[1] = 2 + 7 = 9
        所以返回 [0, 1]

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/two-sum
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

        https://labuladong.gitbook.io/algo/shu-ju-jie-gou-xi-lie/2.5-shou-ba-shou-shua-shu-zu-ti-mu/twosum-wen-ti-de-he-xin-si-xiang


        */

import java.util.*;

public class SumTwoNums {

    public static void main(String[] args) {

        int[] nums = {7 ,11, 15, 2};
        int target = 9;
        for (Integer i : twoSum(nums, target)) {
            System.out.println(i);
        }
    }

    //时间复杂度O（n）查找复杂度
    private static int[] twoSum(int nums[], int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[] {map.get(temp), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {-1, -1};
    }



}
