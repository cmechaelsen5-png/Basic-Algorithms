import java.util.Scanner;
public class binarySearch{
  public static int binarySearch(int[] numbers, int key){
    int low = 0;
    int high = numbers.length-1; 
    while (high >= low){
     int mid = (high + low)/2;
      if (numbers[mid] == key){
        return mid;
      }
      else if (numbers[mid] < key){
        low = mid + 1;
      }
      else if (numbers[mid] > key){
        high = mid - 1;
      }
    }
  return -1;
}
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    int[] numbers = {2, 4, 7, 10, 11, 32, 45, 87};
    int key;
    int keyIndex;
    System.out.println("Enter a number: ");
    key = scnr.nextInt();
    keyIndex = binarySearch(numbers, key);
    if (keyIndex != -1){
      System.out.println(key + " Found at index: " + keyIndex);
    }
    else{
      System.out.println("Value not found.");
    }
    scnr.close();
  }
}
