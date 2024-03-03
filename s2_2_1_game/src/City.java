public class City {
  private Resources power;
  private int yearOfBirth;

  public City(int year, int food, int gold) {
    this.power = new Resources(gold, food);
    this.yearOfBirth = year;
  }

  public Resources getPower() {
    return power;
  }

  public int getYear() {
    return yearOfBirth;
  }

}
