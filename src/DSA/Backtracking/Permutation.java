package DSA.Backtracking;

import java.util.*;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permute(res, new ArrayList<>(), nums);
        return res;
    }

    void permute(List<List<Integer>> res, List<Integer> cur, int[] nums) {
        if(cur.size() == nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(cur.contains(nums[i]))continue;
            cur.add(nums[i]);
            permute(res, cur, nums);
            cur.remove(cur.size() - 1);
        }
    }
}
