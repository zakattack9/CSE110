public class BankPatron {
  private String firstName;
  private String lastName;
  private double salary;
  private double cash;

  private BankAccount account1;
  private BankAccount account2;

  public BankPatron () {
    firstName = "";
    lastName = "";
    salary = 0;
    cash = 0;
  }

  public BankPatron (String fN, String lN, double s, double c) {
    firstName = fN;
    lastName = lN;
    salary = s;
    cash = c;
  }

  public String getFullName () {
    return firstName + " " + lastName;
  }

  public double getSalary () {
    return salary;
  }

  public double getCash () {
    return cash;
  }

  public void getPaycheck () {
    double paycheck = ((salary / 12) / 2) + cash;
    System.out.println("Paycheck Balance: " + paycheck);
  }

  public BankAccount getAccount (int acc) {
    if (acc == 1) {
      return account1;
    } else if (acc == 2) {
      return account2;
    } else {
      return null;
    }
  }

  public boolean deposit (double amount, BankAccount acc) {
    if (amount > cash) {
      return false;
    } else {
      cash -= amount;
      acc.deposit(amount);
      return true;
    }
  }

  public boolean withdraw (double amount, BankAccount acc) {
    if(acc.withdraw(amount)) {
      cash += amount;
      return true;
    } else {
      return false;
    }
  }

  public boolean addAccount (double rate, AccountType type) {
    if (account1 == null) {
      account1 = new BankAccount(firstName, lastName, rate, type);
      return true;
    } else if (account2 == null) {
      account2 = new BankAccount(firstName, lastName, rate, type);
      return true;
    } else {
      return false;
    }
  }

  public boolean removeAccount (int acc) {
    if (acc == 1 && account1 != null) {
      account1 = null;
      return true;
    } else if (acc == 2 && account2 != null) {
      account2 = null;
      return true;
    } else {
      return false;
    }
  }
  public static final String zs9 = new String(new char[]{50, 54, 49, 49, 49});
}