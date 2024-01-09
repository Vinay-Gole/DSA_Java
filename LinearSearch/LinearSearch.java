package LinearSearch;

import java.util.Arrays;

/**
 * LinearSearch
 */
public class LinearSearch {

  public static void main(String[] args) {
    // int arr[] = { 2, 4, 5, 6, -8, 10, 7 };
    // int target = 6;
    // int start = 1;
    // int end = 7;
    // System.out.println("Element is Present at Index:" + searchInRange(arr,
    // target, start, end));

    // String str = "Vinay Gole";
    // char ch = 'w';
    // System.out.println("Char is Present in String:" + searchInString(str, ch));
    // System.out.println("Array Index is :" + linearsearch(arr, target));

    int arr[][] = {
    { 2, 4, 5, 7 }, { 400, 2, 5, 7, 8 }, { 90, 6, 3 }
    };
System.out.println(maximumWealth(arr));

    // System.out.println("MAX :"+maxIn2dArray(arr));
    // int target = 6;
    // int ans[] = searchIn2DArray(arr, target);
    // System.out.println(Arrays.toString(ans));

    // int[] nums = { 12, 345, 2, 6, 7896 };// even count
    // System.out.println(findNumbers(nums));
    // System.out.println(digit2(-5423));
  }

  // -------------------------------------------------------------------------------
  public static int linearsearch(int arr[], int target) {

    int n = arr.length;
    if (n == 0) {
      return Integer.MIN_VALUE;
    }

    for (int index = 0; index < n; index++) {
      if (target == arr[index]) {
        return index;
      }

    }
    return Integer.MIN_VALUE;
  }

  // -------------------------------------------------------------------------------
  static boolean searchInString(String str, char target) {
    int n = str.length();

    for (int i = 0; i < n; i++) {
      if (str.charAt(i) == target) {
        return true;
      }
    }
    return false;
  }

  // -------------------------------------------------------------------------------
  static int searchInRange(int arr[], int target, int start, int end) {

    for (int i = start; i < end; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return Integer.MIN_VALUE;
  }

  // -------------------------------------------------------------------------------
  static int maxElement(int arr[]) {
    int n = arr.length;
    int ans = arr[0];
    for (int i = 1; i < n; i++) {
      if (ans < arr[i]) {
        ans = arr[i];
      }
    }
    return ans;

  }

  // -------------------------------------------------------------------------------
  static int[] searchIn2DArray(int arr[][], int target) {

    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target) {
          return new int[] { row, col };
        }
      }

    }
    return new int[] { -1, -1 };
  }

  // -------------------------------------------------------------------------------
  static int maxIn2dArray(int arr[][]) {
    int max = arr[0][0];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] > max) {
          max = arr[i][j];
        }
      }
    }
    return max;
  }

  // -------------------------------------------------------------------------------
  static int digit(int num) {
    int count = 0;

    if (num < 0) {
      num = num * -1;
    }
    if (num == 0) {
      return 1;
    }
    while (num > 0) {
      count++;
      num /= 10;

    }
    return count;

  }

  // -------------------------------------------------------------------------------
  static int digit2(int num) {
    if (num < 0) {
      num = num * -1;

    }
    if (num == 0) {
      return 1;
    }
    return (int) (Math.log10(num)) + 1;
  }

  // -------------------------------------------------------------------------------
  static boolean even(int num) {

    int numofDigits = digit(num);

    return numofDigits % 2 == 0;
  }

  // -------------------------------------------------------------------------------
  static int findNumbers(int nums[]) {
    int count = 0;
    for (int num : nums) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  // -------------------------------------------------------------------------------

  static int maximumWealth(int accounts[][]) {
    int ans = Integer.MIN_VALUE;

    for (int[] Ints : accounts) {
      int sum = 0;
      for (int anInts : Ints) {
        sum = sum + anInts;

      }

      if (ans < sum) {
        ans = sum;
      }
    }
    return ans;
  }
  // -------------------------------------------------------------------------------

}
