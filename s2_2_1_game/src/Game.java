public class Game {

  private Player[] players;

  public Player[] getPlayers() {
    return players;
  }

  public Game(Player[] players) {
    this.players = players;
  }

  public Player getRichest() {

    int maxGold = 0;
    Player richestPlayer = null;

    // Alle Player abfragen
    for (Player player : players) {
      int sumGold = 0;

      // Alle Cities eines Players abfragen
      for (City city : player.getCities()) {
        sumGold += city.getPower().getGold();
      }

      if (richestPlayer == null) {
        richestPlayer = player;
        maxGold = sumGold;
      } else {
        if (sumGold >= maxGold) {
          richestPlayer = player;
          maxGold = sumGold;
        }
      }
    }

    return richestPlayer;
  }

}
