package aufgabe9;

import java.util.ArrayList;

public class Model {

  private ArrayList<String> wordList = new ArrayList<>();

  public void addWord(String word) {
    wordList.add(word);

  }

  public String getWordList() {
    StringBuilder sb = new StringBuilder();
    for (String w : wordList) {
      sb.append(w + '\n');
    }

    return sb.toString();
  }

  public String searchWordList(String word) {

    String answer = "Wort wurd nicht gefunden !!!";

    for (String w : wordList) {
      if (w.equals(word)) {
        answer = w;
      }
    }

    return answer;
  }

}
