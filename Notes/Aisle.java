public class Aisle {
  private Shelf s1;
  private Shelf s2;
  private Shelf s3;

  public Aisle () {
    s1 = new Shelf();
    s2 = new Shelf(new Widget(), null);
    s3 = new Shelf(null, new Wudget());
  }

  public Shelf getShelf (int s) {
    Shelf out = null;
    if (s == 1) {
      out = s1; //copies address of Shelf object
    } else if (s == 2) {
      out = s2;
    } else if (s == 3) {
      out = s3;
    }
    return out;
  }
}