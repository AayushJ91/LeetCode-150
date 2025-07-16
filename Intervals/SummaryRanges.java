import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(j < nums.length) {
            System.out.println("J:"+j);
//            System.out.println("nums[j+1]:"+nums[j+1]);
            System.out.println("nums[j]:"+nums[j]);
            if (j == nums.length - 1) {
                String n = nums[i] + "->" + nums[j];
                if (i == j) {
                    n = nums[i]+"";
                }
                res.add(n);
                break;
            }
            if (nums[j+1] != nums[j]+1) {
                String n = nums[i] + "->" + nums[j];
                if (i == j) {
                    n = nums[i]+"";
                }
                res.add(n);
                i = j+1;
            }
            j++;
            System.out.println(res);
            System.out.println();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,7};
        System.out.println(summaryRanges(arr));
    }
}
