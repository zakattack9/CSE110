public class PatronList {
  private BankPatron patron1;
  private BankPatron patron2;
  private BankPatron patron3;
  private BankPatron patron4;
  private BankPatron patron5;
  private BankPatron[] patronArr = {patron1, patron2, patron3, patron4, patron5};

  public PatronList () {
    patron1 = null;
    patron2 = null;
    patron3 = null;
    patron4 = null;
    patron5 = null;
  }

  public boolean addBankPatron (BankPatron newPatron) {
    boolean openAccount = false;
    for (int i = 0; i < patronArr.length; i++) {
      if (patronArr[i] == null) {
        patronArr[i] = newPatron;
        openAccount = true;
        break;
      }
    }
    return openAccount;
  }

  public boolean addBankPatron (String firstName, String lastName, double salary, double cash) {
    return addBankPatron(new BankPatron(firstName, lastName, salary, cash)) ? true : false;
  }

  public BankPatron getPatron (int patronNum) {
    if (patronNum > 4) {
      return null;
    } else {
      return patronArr[patronNum];
    }
  }

  public BankPatron findPatron (String fullName) {
    BankPatron foundPatron = null;
    for (int i = 0; i < patronArr.length; i++) {
      if (patronArr[i].getFullName().matches(fullName)) {
        foundPatron = patronArr[i];
        break;
      }
    }
    return foundPatron;
  }

  public boolean removePatron (String fullName) {
    boolean result = false;
    for (int i = 0; i < patronArr.length; i++) {
      if (patronArr[i] != null) {
        if (patronArr[i].getFullName().matches(fullName)) {
          patronArr[i] = null;
          result = true;
          break;
        }
      }
    }
    return result;
  }

  public String getPatronInfo () {
    String patronInfo = "";
    for (int i = 0; i < patronArr.length; i++) {
      //Ghaith Salman Checking 1001 Balance: 50.0 Interest Rate: 2.0
      if (patronArr[i] != null) {
        String name = patronArr[i].getFullName();
  
        patronInfo += name + "\n";
        if (patronArr[i].getAccount(1) != null) {
          patronInfo += "  " + patronArr[i].getAccount(1).getType() + " " + patronArr[i].getAccount(1).getAccountNum() + " Balance: " + patronArr[i].getAccount(1).checkBalance() + " Interest Rate: " + patronArr[i].getAccount(1).getRate() + "\n";
        } if (patronArr[i].getAccount(2) != null) {
          patronInfo += "  " + patronArr[i].getAccount(2).getType() + " " + patronArr[i].getAccount(2).getAccountNum() + " Balance: " + patronArr[i].getAccount(2).checkBalance() + " Interest Rate: " + patronArr[i].getAccount(2).getRate() + "\n";
        }
      }
    }

    return patronInfo;
  }
  public static final String zs9 = new String(new char[]{50, 54, 49, 49, 49});
}