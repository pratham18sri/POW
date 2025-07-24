import java.util.Arrays;

public class SmallestNotRepresentableSum {
    public static int findSmallest(int[] arr) {
        Arrays.sort(arr);
        int res = 1;
        for (int num : arr) {
            if (num > res) break;
            res += num;
        }
        return res;
    }
}
