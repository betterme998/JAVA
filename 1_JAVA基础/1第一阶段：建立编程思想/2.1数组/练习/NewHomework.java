import java.util.Scanner;
public class NewHomework {
  public static void main(String[] args) {
    // 优化实现方法
    // 4.已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如:
    // [10,12,45,90],添加23后,数组为[10,12,23,45,90]
    Scanner sc = new Scanner(System.in);
    int[] arr = {10,12,45,90};

    while (true) {
      System.out.println("请输入要插入的数字：");
      int num = sc.nextInt();
      arr = insertSorted(arr, num);

      System.out.print("插入后的数组未：");
      for (int value : arr) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  } 
  //向升序数组中插入一个元素，返回新的升序数组
  private static int[] insertSorted(int[] arr, int num) {
    int index = lowerBound(arr, num);
    int[] newArr = new int[arr.length + 1];
    for(int i = 0, j=0; i < newArr.length; i++) {
      newArr[i] = (i == index) ? num : arr[j++];
    }
    return newArr;
  } 

  // 返回第一个 >= num 的下标
  private static int lowerBound(int[] arr, int num) {
    int lo = 0, hi = arr.length; //搜索区间[lo, hi)
    while (lo < hi) {
      int mid = (lo + hi) >>> 1;// 无符号右移，避免 lo+hi 溢出相当于 (lo + hi) / 2
      if (arr[mid] < num) lo = mid + 1; //答案在右半区间
      else hi = mid;
    }
    return lo;
  }
   
}
