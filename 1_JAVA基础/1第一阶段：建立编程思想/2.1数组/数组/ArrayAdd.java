import java.util.Scanner;
public class ArrayAdd {
  // 实现动态的给数组添加元素效果，实现对数组扩容。
  // 原始数组使用静态分配int[]arr={1,2,3}
  // 增加的元素4，直接放在数组的最后 arr={1,2,3,4}
  /*
  思路分析
  1.定义初始数组 int[]= {1,2,3}//下标0-2
  2.2.定义一个新的数组int[]arrNew = new int[arr.length+1];
  3.遍历arr数组，依次将arr的元素拷贝到 arrNew数组、
  4. 4 赋给 arrNew[arrNew.length-1] = 4
  5.让arr指向arrNew； arr = arrNew;
  6.创建一个Scanner可以接受用户输入
  7.因为用户什么时候退出，不确定，老师使用 do-while+break来控制
  */ 
  // 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续?y/n
  public static void main(String[] args) {
    int[] arr = {1,2,3};//静态分配数组
    Scanner sc = new Scanner(System.in);
    Boolean condition = true;

    
    while (condition) {
      System.out.println("是否继续添加元素？Y/N");
      condition = sc.nextLine().equals("Y") ? true : false;
      if (condition) {
        break;
      }
      int[] newArr = new int[arr.length+1];
      for (int i = 0; i < arr.length; i++) {
        newArr[i] = arr[i];
      }
      System.out.println("请输入要添加的元素");
      newArr[arr.length] = sc.nextInt();
      sc.nextLine(); // 消耗换行符
      arr = newArr;
    }
    // 输出数组元素
    for (int i : arr) {
      System.out.println(i);
    }
    sc.close();
  }
}
