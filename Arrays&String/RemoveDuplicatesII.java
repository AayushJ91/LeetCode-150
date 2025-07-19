import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesII {
    static int removeDuplicates(int[] nums) {
        List<Integer> helper = new ArrayList<>();
        int n = nums.length;
        int count = 0;
        int z = 2;
        while (z < n) {
            if (nums[z] == nums[z-1]) {
                nums[z] = Integer.MIN_VALUE;
                count++;
                z += 3;
            }else {
                z += 2;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < n; i++) {
            if (nums[i] != Integer.MIN_VALUE) {
                helper.add(nums[i]);
            }
        }
        for (int i = 0; i < count; i++) {
            helper.add(-99);
        }
        System.out.println("helper:"+helper);
        for (int i = 0; i < n; i++) {
            nums[i] = helper.get(i);
            System.out.println(Arrays.toString(nums));
        }

        return n - count;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
