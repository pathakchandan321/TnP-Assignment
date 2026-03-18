package BNY;

import java.util.ArrayList;
import java.util.List;

public class EqualArrayElement {
        public List<Long> minOperations(int[] nums, int[] queries) {
            int m=nums.length;
            int n=queries.length;
            List<Long> l=new ArrayList<>();

            for(int i=0;i<n;i++){
                long count=0;
                for(int j=0;j<m;j++){
                    count += Math.abs(nums[j] - queries[i]);
                }
                l.add(count);
            }
            return l;
        }

   public static void main(String[] args) {

   }
}
