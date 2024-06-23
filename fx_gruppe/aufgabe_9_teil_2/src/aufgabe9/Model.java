package aufgabe9;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

  private ArrayList<String> wordList = new ArrayList<>();

  public void addWord(String word) {
    wordList.add(word);

  }

  public ArrayList<String> getWordList() {
    return wordList;
  }

  public ObservableList<String> getItems() {
    return FXCollections.observableArrayList(this.wordList);
  }

}
