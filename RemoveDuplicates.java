
import java.util.Arrays;

public class RemoveDuplicates {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 10, 65, 2, 2, 2, 3, 4, 4, 5, 5, 5 };//array must be sorted
     Arrays.sort(arr);
    int length = removeDuplicates(arr);
    for (int i = 0; i < length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  static int removeDuplicates(int arr[]) {
    
    int n = arr.length;
    if (n == 0 || n == 1) {
      return n;
    }

    int i = 0;
    for (int j = 1; j < n; j++) {
      if (arr[i] != arr[j]) {
        i++;
        arr[i] = arr[j];
      }
    }
    return (i + 1);
  }
}