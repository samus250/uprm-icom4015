public class Names {
  private String[] names;

  public Names(int size) {
    this.names = new String[size];
  }

  public void set(int i, String name) {
    this.names[i] = name;
  }

  public int largerCount(String name) {
    int count = 0;
    for (int i = 0; i < names.length; i++) {
      if (name.compareTo(names[i]) < 0)
        count++;
    }

    return count;
  }
}
