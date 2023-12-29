public class SecondLargest {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 5, 6 };

    int largest = nums[0];
    int secLarge = -1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > largest) {
        secLarge = largest;
        largest = nums[i];
      } else if (nums[i] < largest && nums[i] > secLarge) {
        secLarge = nums[i];
      }
    }
    System.out.println("Largest Number is:" + largest);
    System.out.println("second Largest is :" + secLarge);
  }
}
