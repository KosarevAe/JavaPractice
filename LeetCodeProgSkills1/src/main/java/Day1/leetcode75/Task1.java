package Day1.leetcode75;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums){
        int[] resultArray = nums.clone();
        for (int i = 0; i < resultArray.length; i++) {
            if(i < 1){

            }else {
             resultArray[i] = resultArray[i-1] + nums[i];
            }
        }
        return resultArray;
    }

}
