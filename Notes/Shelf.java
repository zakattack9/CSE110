public class Shelf {
  private Widget wid1;
  private Widget wid2;

  public Shelf () {
    wid1 = new Widget();
    wid2 = new Widget();
  }

  public Shelf (Widget w1, Widget w2) {
    wid1 = w1;
    wid2 = w2;
  }

  public Widget getWid1 () {
    return wid1;
  }

  public Widget getWid2 () {
    return wid2;
  }
}