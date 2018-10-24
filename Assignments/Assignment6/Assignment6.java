import java.util.Scanner;

public class Assignment6 {
  public static Scanner scan = new Scanner(System.in);
  public static PatronList patrons = new PatronList();

  public static void main(String[] args) {
    System.out.println("Welcome to the bank");

    String input = mainMenu();

    while (!input.equals("e")) {
      if (input.equals("a")) {
        System.out.println(patrons.getPatronInfo() == "" ? "None" : patrons.getPatronInfo());
      } else if (input.equals("b")) {
        System.out.println("Enter first name");
        String firstName = scan.nextLine();
        System.out.println("Enter last name");
        String lastName = scan.nextLine();
        System.out.println("Enter your salary");
        double salary = scan.nextDouble();
        System.out.println("Enter the amount of cash you have");
        double cash = scan.nextDouble();
        scan.nextLine();

        System.out.println(patrons.addBankPatron(firstName, lastName, salary, cash) ? "Patron successfully added" : "Sorry, the bank line is full");
      } else if (input.equals("c")) {
        System.out.println("Enter the full name of the person to remove");
        String fullName = scan.nextLine();

        System.out.println(patrons.removePatron(fullName) ? "Patron successfully removed" : "Patron does not exsit");

      } else if (input.equals("d")) {
        System.out.println("Enter the full name of the person");
        String fullName = scan.nextLine();

        if (patrons.findPatron(fullName) == null) {
          System.out.println("Patron does not exist");
        } else {
          patronActions(patrons.findPatron(fullName));
        }
      }

      input = mainMenu();
    }

    System.out.println("Thanks for coming to the bank!");
  }

  public static String mainMenu() {
    String menu = "a. List Patrons\nb. Add New Patron\nc. Remove Patron\nd. Patron Specific Actions\ne. Quit";

    System.out.println(menu);
    String input = scan.nextLine();

    while (!input.matches("a|b|c|d|e")) {
      System.out.println("Input a valid option: \n" + menu);
      input = scan.nextLine();
    }

    return input;
  }

  public static String patronMenu() {
    String menu = "a. Add New Account\nb. Close Account\nc. Get Paid\nd. Apply Interest to Accounts\ne. Make Deposit\nf. Make Withdraw\ng. Return to Main Menu";

    System.out.println(menu);
    String input = scan.nextLine();

    while (!input.matches("a|b|c|d|e|f|g")) {
      System.out.println("Input a valid option: \n" + menu);
      input = scan.nextLine();
    }

    return input;
  }

  public static AccountType accountMenu() {
    String menu = "a. Checking\nb. Savings\nc. CD\nd. Money Market\ne. IRA";

    System.out.println(menu);
    String input = scan.nextLine();

    while (!input.matches("a|b|c|d|e")) {
      System.out.println("Input a valid option: \n" + menu);
      input = scan.nextLine();
    }

    AccountType convertedInp = AccountType.Checking; //temp val
    switch (input) {
      case "a":
        convertedInp = AccountType.Checking;
        break;
      case "b":
        convertedInp = AccountType.Savings;
        break;
      case "c":
        convertedInp = AccountType.CD;
        break;
      case "d":
        convertedInp = AccountType.MoneyMarket;
        break;
      case "e":
        convertedInp = AccountType.IRA;
        break;
    }

    return convertedInp;
  }

  public static void patronActions(BankPatron patron) {
    String input = patronMenu();

    while (!input.equals("g")) {
      if (input.equals("a")) {
        System.out.println("What type of account do you want?");
        AccountType type = accountMenu();
        System.out.println("Input your rate:");
        double rate = scan.nextDouble();
        scan.nextLine();

        System.out.println(patron.addAccount(rate, type) ? "Account successfully added" : "Account not created");
      } else if (input.equals("b")) {
        System.out.println("Which account would you like to close?");
        int acc = scan.nextInt();
        scan.nextLine();

        System.out.println(patron.removeAccount(acc) ? "Account successfully removed" : "Account not removed");
      } else if (input.equals("c")) {
        patron.getPaycheck();
      } else if (input.equals("d")) {
        if (patron.getAccount(1) != null) {
          patron.getAccount(1).applyInterest();
        }
        if (patron.getAccount(2) != null) {
          patron.getAccount(2).applyInterest();
        } else {
          System.out.println("No accounts available to apply interest to");
        }
      } else if (input.equals("e")) {
        System.out.println("What account would you like to deposit money into?");
        int acc = scan.nextInt();
        System.out.println("Enter the amount to deposit");
        double amount = scan.nextDouble();
        scan.nextLine();

        if (acc != 1 && acc != 2) {
          System.out.println("Account does not exist");
        } else {
          System.out.println(patron.deposit(amount, patron.getAccount(acc)) ? "Deposit successfull" : "Deposit unsuccessfull");
        }
      } else if (input.equals("f")) {
        System.out.println("What account would you like to withdraw money from?");
        int acc = scan.nextInt();
        System.out.println("Enter the amount to withdraw");
        double amount = scan.nextDouble();
        scan.nextLine();

        if (acc != 1 && acc != 2) {
          System.out.println("Account does not exist");
        } else {
          System.out.println(patron.withdraw(amount, patron.getAccount(acc)) ? "Withdraw successfull" : "Withdraw unsuccessfull");
        }
      }

      input = patronMenu();
    }
  }

  public static final String zs9 = new String(new char[] { 50, 54, 49, 49, 49 });
}