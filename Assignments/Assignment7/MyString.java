public class MyString {
  private int strLength;
  private char[] strChar;

  public MyString () {
    strLength = 0;
    strChar = new char[0];
  }

  public MyString (String str) {
    strChar = new char[str.length()];
    for (int i = 0; i < strChar.length; i++) {
      strChar[i] = str.charAt(i);
    }
    strLength = strChar.length;
  }

  public boolean equals (String str) {
    boolean res = true;
    char[] strArr = str.toCharArray();

    if (strChar.length == strArr.length) {
      for (int i = 0; i < strChar.length; i++) {
        if (strChar[i] != strArr[i]) {
          res = false;
          break;
        }
      }
    } else {
      res = false;
    }

    return res;
  }

  public int indexOf (char c) {
    int res = -1;

    for (int i = 0; i < strChar.length; i++) {
      if (strChar[i] == c) {
        res = i;
        break;
      }
    }

    return res;
  }

  public int indexOf (String str) {
    int res = -1;
    char[] strArr = str.toCharArray();

    for (int i = 0; i < strChar.length; i++) {
      if (strChar[i] == strArr[0]) {
        res = i;
        for (int j = 0; j < strArr.length; j++) {
          if (strChar[i + j] != strArr[j]) {
            res = -1;
            break;
          }
        }
        break;
      }
    }

    return res;
  }

  public boolean startsWith (String str) {
    boolean res = false;

    if (indexOf(str) == 0) {
      res = true;
    }

    return res;
  }

  public boolean endsWith (String str) {
    boolean res = false;

    if (indexOf(str) + str.length() - 1 == strLength - 1) {
      res = true;
    }

    return res;
  }

  public boolean contains (String str) {
    boolean res = false;

    if (indexOf(str) != -1) {
      res = true;
    }

    return res;
  }

  public String toString () {
    String res = "";
    
    for (int i = 0; i < strChar.length; i++) {
      res += strChar[i];
    }
    
    return res;
  }
}