import Java.util.Scanner;
public Class binarySearch{
  public static int binarySearch(int[] arr int key){
    int low = 0;
    int high = arr.length-1; 
    while (high>=low){
     int mid = (high + low)/2;
      if (arr[mid] == key){
        return mid;
      }
      else if (arr[mid] < key){
        low = mid + 1;
      }
      else if (arr[mid] > key){
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
    Scanner scnr = new Scanner(System.in);
    key = scnr.nextInt();
    keyIndex = binarySearch(arr, key);
    if (keyIndex != -1){
      System.out.println(key + " Found at index: " keyIndex);
    }
    else{
      System.out.prinln("Value not found.");
    }
    scnr.close();
  }
}
    
      
  
    
