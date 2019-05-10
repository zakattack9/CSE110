public class Lab12 {
  public static void main (String[] args) {
    String[] array = {"John","Thomas","Alex","Tyler","Elizabeth"};

    printArr(array);
    searchArr(array, "Alex");
    System.out.println(checkSorted(array));
    bubbleSort(array);
    System.out.println(checkSorted(array));
    printArr(array);
  }

  public static void printArr (String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void searchArr (String[] arr, String search) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(search)) {
        System.out.println(i);
        break;
      }
    }
  }

  public static boolean checkSorted (String[] arr) {
    boolean sorted = true;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
          sorted = false;
          break;
        }
      }
    }
    return sorted;
  }

  public static void bubbleSort (String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
          String temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}