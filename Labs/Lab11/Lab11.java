import java.util.Scanner;

public class Lab11 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] array = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    printArray(array);
    insertElements(array, scan);
    insertElementIntoArray(array, scan);
    deleteElementFromArray(array, scan);

    int[][] arr2D = new int[10][10];
    
    int fill = 0;
    for (int row = 0; row < arr2D.length; row++) {
      for (int column = 0; column < arr2D[row].length; column++) {
        arr2D[row][column] = (fill++ % 10);
      }
    }
    print2D(arr2D);
  }

  public static void printArray (int[] arr) {
    for (int row = 0; row < arr.length; row++) {
      System.out.print(arr[row] + " ");
    }
  }

  public static void insertElements (int[] arr, Scanner scan) {
    for (int row = 0; row < arr.length; row++) {
      System.out.println("Input integer");

      int input = scan.nextInt();
      while (input < 0) {
        System.out.println("Please input a positive number");
        input = scan.nextInt();
      }

      arr[row] = input;
    }
    printArray(arr);
  }

  public static void insertElementIntoArray (int[] arr, Scanner scan) {
    int[] copy = new int[arr.length + 1];

    System.out.println("Input an index");
    int index = scan.nextInt();
    while (index > arr.length) {
      System.out.println("Please input a number within array range");
      index = scan.nextInt();
    }

    System.out.println("Input a number to insert");
    int input = scan.nextInt();

    int shift = 0;
    for (int i = 0; i < copy.length; i++) {
      if (i == index) {
        copy[i] = input;
        shift = -1;
      } else {
        copy[i] = arr[i + shift];
      }
    }

    printArray(copy);
  }

  public static void deleteElementFromArray (int[] arr, Scanner scan) {
    int[] copy = new int[arr.length];

    System.out.println("Input an index");
    int index = scan.nextInt();
    while (index > arr.length) {
      System.out.println("Please input a number within array range");
      index = scan.nextInt();
    }

    for (int i = 0; i < copy.length; i++) {
      if (i == index) {
        copy[i] = -1;
      } else {
        copy[i] = arr[i];
      }
    }

    printArray(copy);
  }

  public static void print2D (int[][] arr) {
    for (int row = 0; row < arr.length; row++) {
      for (int column = 0; column < arr[row].length; column++) {
        System.out.print(arr[row][column] + " ");
      }
      System.out.println();
    }
  }
}