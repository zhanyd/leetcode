package twoSum;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void twoSumTest(){
        TwoSum towSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = towSum.twoSum(nums,target);
        for(int i : result){
            System.out.println(i);
        }

        System.out.println("---------------------");
        nums = new int[]{2, 8, 11, 15, 23, 12};
        target = 38;
        result = towSum.twoSum(nums,target);
        for(int i : result){
            System.out.println(i);
        }
    }
}
