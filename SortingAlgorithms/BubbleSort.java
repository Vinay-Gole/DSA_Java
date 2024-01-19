package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int nums[] = { 86, 5, 3, 164, 3, 4 ,84};
    bubbleSort(nums);
    System.out.println("Sorted Array is:");
    System.out.println(Arrays.toString(nums));

  }
  
  static void bubbleSort(int arr[]) {
    int n = arr.length;
    for(int i=0;i<n;i++){
      for (int j = 1; j < n - i - 1; j++) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }

  }
}
