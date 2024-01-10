package BinarySearch;
/*
 * Ceiling:return the smallest Number that is bigger than or equal to the target Number
 * 
 */
public class CeilingOfNumber {
  public static void main(String[] args) {
    int nums[] = { 2, 3, 5, 9, 14, 16, 18 };
    int tar = 13;
    System.out.println("Celing Index:" + ceilingOfANumber(nums, tar));
  }

  static int ceilingOfANumber(int nums[], int tar) {
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      if(tar>nums[nums.length-1]){
        return -1;
      }
      int mid = start + (end - start) / 2;
      if (tar < nums[mid]) {
        end = mid - 1;

      } else if (tar > nums[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return start;
  }
}
