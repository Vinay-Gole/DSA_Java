package BinarySearch;

import java.util.Arrays;

public class FindFirstLast {
  public static void main(String[] args) {

    int arr[] = { 2, 4, 5, 5, 5, 5, 6, 7, 8 };
    int target = 5;
    int ans[] = searchRange(arr, target);
    System.out.println(Arrays.toString(ans));
    // printArray(ans);

  }

  static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static int[] searchRange(int arr[], int target) {
    int ans[] = { -1, -1 };

    ans[0] = search(arr, target, true);
    ans[1] = search(arr, target, false);
    return ans;
  }

  static int search(int[] arr, int target, boolean findStartIndex) {
    int start = 0;
    int end = arr.length - 1;
    int ans = -1;
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        ans = mid;
        if (findStartIndex) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return ans;
  }
}
