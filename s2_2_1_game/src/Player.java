public class Player {

  private String nickname;
  private City[] cities = null;

  public Player(String nickname, City[] cities) {
    this.nickname = nickname;
    this.cities = cities;
  }

  public City[] getCities() {
    return cities;
  }

  @Override
  public String toString() {
    return nickname;
  }
}
