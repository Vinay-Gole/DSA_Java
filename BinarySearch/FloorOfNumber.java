package BinarySearch;

/*
 * Floor:return the biggest Number that is smaller than or equal to the target Number
 * 
 */
public class FloorOfNumber {
  public static void main(String[] args) {
    int nums[] = { 2, 3, 5, 9, 14, 16, 18 };
    int tar = 1;
    System.out.println("Floor Index is:"+floorOfANumber(nums, tar));
  }
  static int floorOfANumber(int nums[], int tar) {
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (tar < nums[mid]) {
        end = mid - 1;

      } else if (tar > nums[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return end;
  }
}
