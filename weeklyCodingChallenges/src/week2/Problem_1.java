package week2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem_1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] nums = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();
        
       if(nums.length % 2 != 0){
    	   return nums[nums.length / 2];
       }
        
       int min = nums[(nums.length/2) - 1];
       int max = nums[nums.length/2];

       return (min+max)/2.0;
    }
}
