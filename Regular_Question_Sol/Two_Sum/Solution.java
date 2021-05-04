package Two_Sum;

import java.util.HashMap;
import java.util.Arrays;

class Solution {

    public static int[] twoSum(int[] nums, int target){
        int[] result;
        int len = nums.length, tmp, cur;
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();

        for (int i = 0; i < len; i++){
            cur = nums[i];
            tmp = target - cur;

            if (table.containsKey(tmp)){
                result = new int[] {(int)table.get(tmp), i};
                return result;
            }

            table.put(cur, i);
        }

        return new int[]{0,0};
    }

    public static void main(String[] args){
        int[][] inputList = {{2, 7, 11, 15}, {9}
                             };
        
        int[][] answerList = {{0, 1}, {}};

        for (int i = 0; i < inputList.length; i += 2) {
            int[] result = twoSum(inputList[i], inputList[i+1][0]);
            
            if (Arrays.equals(answerList[i], result)) {
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    }


}