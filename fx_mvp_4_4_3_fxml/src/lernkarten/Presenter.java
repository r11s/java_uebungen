package lernkarten;

public class Presenter {

  private Model model;
  private View view;

  public int tries;

  public Presenter(View view) {

    this.model = new Model();
    this.view = view;
  }

  public void choose() {
    String word = model.choose();
    view.showNewWord(word);
    view.eraseMessage();
    tries = 0;
  }

  public void check(String lang1, String lang2) {

    lang2 = lang2.trim().toLowerCase();

    if (lang2.length() == 0) {
      view.showNoInputMessage();
      return;
    }

    if (model.check(lang1, lang2)) {
      view.showOKMessage();
    } else {
      view.showNotOkMessage();
    }

  }

}
