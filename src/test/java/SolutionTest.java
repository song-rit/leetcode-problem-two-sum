import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertEquals(0, result[0]);
        Assertions.assertEquals(1, result[1]);
    }

    @Test
    public void testCase2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(2, result[1]);
    }

    @Test
    public void testCase3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertEquals(0, result[0]);
    }
}
