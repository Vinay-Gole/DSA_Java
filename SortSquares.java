public class SortSquares {
  public static void main(String[] args) {
    int arr[] = { -10, 2, 3, 5, 6, 9 };
    int ans[] = sortSquares(arr);
    printArray(ans);

  }

  
  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  
  public static int[] sortSquares(int arr[]) {
    int n = arr.length;
    int ans[] = new int[n];
    int k=n-1;
    int left = 0;
    int right=n-1;
    while (left <= right) {
      if (Math.abs(arr[left]) > Math.abs(arr[right])) {
        ans[k--] = arr[left] * arr[left];
        left++;

      } else {
        ans[k--] = arr[right] * arr[right];
        right--;
      }

    }
    return ans;
  }
}
