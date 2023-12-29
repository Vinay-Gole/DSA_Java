package StringQuestions;

public class ReverseStringWord {
  public static void main(String[] args) {
    String str = "Gole is Vinay";
    System.out.println(reveStringWord(str));

  }

  static String reveStringWord(String str) {
    String[] words = str.split(" +");
    StringBuilder sb = new StringBuilder();

    for (int i = words.length - 1; i >= 0; i--) {
     sb.append(words[i]);
     sb.append(" ");
    }
    return sb.toString().trim();
  }
}
