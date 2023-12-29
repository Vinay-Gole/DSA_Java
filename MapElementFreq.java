import java.util.HashMap;
import java.util.Map;

public class MapElementFreq {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 8, 5, 6, 6, 4, 8, 2, 6, 9, 5, 1, 3, 2, 2, 2, 6 };
    frequencyOfElement(arr);
    
  }

  static void frequencyOfElement(int arr[]){
    int n=arr.length;
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < n; i++) {
      if (hm.containsKey(arr[i])) {

        hm.put(arr[i], hm.get(arr[i]) + 1);

      } else {
        hm.put(arr[i], 1);
      }
    }
    for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
      System.out.println("Element||Frequency:");
      System.out.println();
      System.out.println(entry.getKey() + " || " + entry.getValue());
      System.out.println();

    }
  }
}
