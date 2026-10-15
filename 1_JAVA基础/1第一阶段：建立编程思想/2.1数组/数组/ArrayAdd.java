import java.util.Scanner;
public class ArrayAdd {
  // 实现动态的给数组添加元素效果，实现对数组扩容。
  // 原始数组使用静态分配int[]arr={1,2,3}
  // 增加的元素4，直接放在数组的最后arr={1,2,3,4)
  public static void main(String[] args) {
    int[] arr = {1,2,3};//静态分配数组
    Scanner sc = new Scanner(System.in);
    Boolean condition;

    System.out.println("是否继续添加元素？Y/N");
    condition = sc.nextLine().equals("Y");
    while (condition) {
      int[] newArr = new int[arr.length+1];
      for (int i = 0; i < arr.length; i++) {
        newArr[i] = arr[i];
      }
      System.out.println("请输入要添加的元素");
      newArr[arr.length] = sc.nextInt();
      sc.nextLine(); // 消耗换行符
      arr = newArr;
      System.out.println("是否继续添加元素？Y/N");
      condition = sc.nextLine().equals("Y") ? true : false;
    }
    // 输出数组元素
    for (int i : arr) {
      System.out.println(i);
    }
    sc.close();
  }
}
