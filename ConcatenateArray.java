package Assignment5;

public class ConcatenateArray {
    public int[] getConcatenation(int[] nums) {

        final int n = nums.length;

        int[] ans = new int[n * 2];

        for (int i = 0; i < n; ++i)
            ans[i] = ans[i + n] = nums[i];

        return ans;
    }
}