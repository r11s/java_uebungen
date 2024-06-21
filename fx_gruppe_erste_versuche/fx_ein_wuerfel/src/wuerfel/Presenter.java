package wuerfel;

public class Presenter {

  // private Model model;
  private View view;

  public Presenter(View view) {

    // this.model = new Model();
    this.view = view;

  }

  public void rollDices() {

    int i = (int) Math.floor(Math.random() * 6 + 1.0);
    int j = (int) Math.floor(Math.random() * 6 + 1.0);

    System.out.println("" + i + ", " + j);

    view.setDices(i, j);
  }

}
