import  java.util.Scanner;
public class ArrayReduce {
  public  static void main(String[] args) {
    /*
    有一个数组{1，2，3，4，5}，可以将该数组进行缩减，提示用户是否继续缩减，
    每次缩减最后那个元素。当只剩下最后一个元素，提示，不能再缩减。
    */ 
   int[] arr = {1,2,3,4,5};
   Scanner sc = new Scanner(System.in);
   while(arr.length > 1) {
    System.out.println("是否继续缩减元素？Y/N");
    if (!sc.nextLine().equals("Y")) {
      break;
    } 
    int[] newArr = new int[arr.length - 1];
    for (int i = 0; i < arr.length - 1; i++) {
      newArr[i] = arr[i];
    }
    arr = newArr;
    for (int i : arr) {
      System.out.println(i);
    }
    if (arr.length == 1) {
      System.out.println("不能再缩减了");
    }
   }
  }
}
