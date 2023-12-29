public class SubArraySum {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3 };//[1,2],[3]=[3,3]
    System.out.println(subArraySum(arr));
  }
  public static int totalSum(int arr[]) {
    int n=arr.length;
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += arr[i];
    }
    return total;
    
  }
    public static boolean subArraySum(int arr[]) {
      int n = arr.length;
      int prefixSum = 0;
    int total = totalSum(arr);
    for (int i = 0; i < n; i++) {
      prefixSum += arr[i];
      int suffixSum = total - prefixSum;
      if (suffixSum == prefixSum) {
        return true;
      }
    }
    return false;
  
  }
}
