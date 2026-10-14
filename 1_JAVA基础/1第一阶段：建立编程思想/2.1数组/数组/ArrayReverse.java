public class ArrayReverse {
  public static void main(String[] args) {
    // 把数组的元素内容反转。
    int[] arr = {1,2,3,4,5};
    int temp = 0;
    for(int i = 0; i < arr.length / 2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
