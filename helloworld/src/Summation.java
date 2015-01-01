public class Summation {
  public int sumUB = 0;

  public Summation() {

  }

  public int doSum() {
    int sum = 0;
    for (int i = 1; i <= sumUB; i++) {
      sum += i;
    }
    return sum;
  }
}
