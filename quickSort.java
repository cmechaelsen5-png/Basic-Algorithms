public class QuickSort{
  public static int partition(int[] nums, int lowIndx, int highIndx){
    int midpoint = lowIndx + (highIndx - lowIndx)/2;
    int pivot = nums[midpoint];
    int temp;
    boolean done = false;
    while (!done){
      while(nums[lowIndx] < pivot){
        lowIndx++;
      }
      while (nums[highIndx] > pivot){
        highIndx--;
      }
      if (lowIndx >= highIndx){
        done = true;
      }
      else{
        temp = nums[lowIndx];
        nums[lowIndx] = nums[highIndx];
        nums[highIndx] = temp;
        lowIndx++;
        highIndx--;
      }
    }
    return highIndx;
  }
  public static void quickSort(int[] nums, int lowIndx, int highIndx){
    if (highIndx <= lowIndx){
      return;
    }
    int lowEndIndx = partition(nums, lowIndx, highIndx);
    quickSort(nums, lowIndx, lowEndIndx);
    quickSort(nums, lowEndIndx +1, highIndx);
  }
  public static void main(String[] args){
    int[] nums = {2, 3, 1, 4, 33, 22, 50, 60, 44};
    System.out.println("Unsorted Numbers: ");
    for (int i=0; i<nums.length; i++){
      if (i<nums.length-1){
        System.out.print(nums[i] + ", ");
      }
      else{
        System.out.print(nums[i] + ".");
      }
    }
    System.out.println();
    System.out.println("Sorted Numbers: ");
    quickSort(nums, 0, nums.length-1);
    for (int j=0; j<nums.length; j++){
      if (j < nums.length-1){
        System.out.print(nums[j] + ", ");
      }
      else{
        System.out.print(nums[j] + ".");
      }
    }
  }
}
      
