package lernkarten;

import java.util.HashMap;

public class Model {

  private final HashMap<String, String> vocabulary;
  private final String[] keyWords;

  public Model() {
    vocabulary = new HashMap<>();
    fillVocabulary();
    keyWords = vocabulary.keySet().toArray(new String[0]);
  }

  public void fillVocabulary() {
    vocabulary.put("Kaffee", "coffee");
    vocabulary.put("Milch", "milk");
    vocabulary.put("Schokolade", "chocolate");
    vocabulary.put("Brot", "bread");
    vocabulary.put("Karotte", "carrot");
    vocabulary.put("Kartoffel", "potato");
    vocabulary.put("Schellfisch", "haddock");
  }

  /**
   * Wort aus dem Vocabulaire waehlen.
   *
   * @return keyWord
   */
  public String choose() {
    int index = (int) (Math.random() * keyWords.length);
    return keyWords[index];
  }

  /**
   * Uebersetzung pruefen
   *
   * @param lang1: Wort in 1. Sprache
   * @param lang2: Wort in 2. Sprache
   * @return true: wenn beide Woerter gleich sind
   */
  public boolean check(String lang1, String lang2) {
    return lang2.equals(vocabulary.get(lang1));
  }

}
