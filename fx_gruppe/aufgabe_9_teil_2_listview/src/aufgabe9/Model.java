package aufgabe9;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

  private ObservableList<String> wordList = FXCollections.observableArrayList();

  ObservableList<String> searchList = FXCollections.observableArrayList();

  public void addWord(String word) {
    wordList.add(word);
  }

  public ObservableList<String> getWordList() {
    return wordList;
  }

  public String getWordCount() {
    return "( " + wordList.size() + " Wörter)";
  }

  public ObservableList<String> getSearchList(String word) {

    searchList.clear();

    for (String w : wordList) {
      if (word.equals(w)) {
        searchList.add(w);
      }
    }
    return searchList;
  }

  public String getGefundenCount() {
    return "( " + searchList.size() + " Wörter gefunden )";
  }

}
