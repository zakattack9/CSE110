import java.util.Scanner;

public class Assignment5 {
  public static Scanner scan = new Scanner(System.in);
  public static void main (String[] args) {
    Pet newPet = new Pet();
    
    Pet pet1 = new Pet("Fido", 3);
    Pet pet2 = new Pet("Furball", 1);
    Pet pet3 = null;
    Pet[] petsArr = new Pet[]{pet1, pet2, pet3}; //array for pets used in choice D
    
    System.out.println("Welcome to the pet store!");
    String choice = printMenu();
    
    while (!choice.equals("E")) {
      if (choice.equals("A")) {
        System.out.println(pet1.getName() + " is " + pet1.getAge() + (pet1.getAge() != 1 ? " years " : " year ") + "old and is " + (pet1.getAdopted() ? "adopted" : "not adopted"));
        System.out.println(pet2.getName() + " is " + pet2.getAge() + (pet2.getAge() != 1 ? " years " : " year ") + "old and is " + (pet2.getAdopted() ? "adopted" : "not adopted"));
        if (pet3 != null) System.out.println(pet3.getName() + " is " + pet3.getAge() + (pet3.getAge() != 1 ? " years " : " year ") + "old and is " + (pet3.getAdopted() ? "adopted" : "not adopted"));
        
        choice = printMenu();
      } else if (choice.equals("B")) {
        pet1.setAge();
        pet2.setAge();
        if (pet3 != null) pet3.setAge();
        System.out.println("Pets have magically aged by one year");

        choice = printMenu();
      } else if (choice.equals("C")) {
        if (pet3 == null) {
          System.out.println("Enter a name for the pet");
          String newPetName = scan.nextLine();

          System.out.println("Enter an age for the pet");
          int newPetAge = scan.nextInt();
          scan.nextLine();

          pet3 = new Pet(newPetName, newPetAge);
        } else {
          System.out.println("A new pet has already been created");
        }

        choice = printMenu();
      } else if (choice.equals("D")) {
        System.out.println("Choose the number of the pet you want to adopt " + (pet3 != null ? "(1, 2, 3)" : "(1, 2)"));
        int selectedPet = scan.nextInt();

        // while (true) {
        //   if (selectedPet > 3 || selectedPet < 1 || (selectedPet == 3 && pet3 == null)) {
        //     System.out.println("Pet does not exist, please select another pet number" + (pet3 != null ? "(1, 2, 3)" : "(1, 2)"));
        //     selectedPet = scan.nextInt();
        //   } else if (petsArr[selectedPet - 1].getAdopted()) {
        //     System.out.println("Pet is already adopted, please select another pet number");
        //     selectedPet = scan.nextInt();
        //   } else {
        //     petsArr[selectedPet - 1].setAdopted();
        //     System.out.println(petsArr[selectedPet - 1].getName() + " has been adopted");

        //     break;
        //   }
        // }

        if (selectedPet > 3 || selectedPet < 1 || (selectedPet == 3 && pet3 == null)) {
          System.out.println("Pet does not exist");
        } else if (petsArr[selectedPet - 1].getAdopted()) {
          System.out.println("Pet is already adopted");
        } else {
          petsArr[selectedPet - 1].setAdopted();
          System.out.println(petsArr[selectedPet - 1].getName() + " has been adopted");
        }

        scan.nextLine();
        choice = printMenu();
      }
    }
    System.out.println("Goodbye, thank you for visiting the pet store");

  }
  
  private static String printMenu () {
    String menu = "Choose an option: \n A. List the pets in the store \n B. Age up the pets \n C. Add a new pet \n D. Adopt a new pet \n E. Quit";
    
    System.out.println(menu);
    String input = scan.nextLine();
    
    while (!input.matches("A|B|C|D|E")) {
      System.out.println("Input a valid option: \n" + menu);
      input = scan.nextLine();
    }
    
    return input;
  }
}