/*
1.顺序查找
2.二分查找
*/ 
import java.util.Scanner;
public class SeqSearch {
  public static void main(String[] args) {
    //案例演示:
    /*
    1.有一个数列:白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏:从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】要求:如果找
    到了，就提示找到，并给出下标值。

    2.请对一个有序数组进行二分查找{1,8,10,89,1000,1234}，输入一个数看看该数组是否存在此数，并且求出下标，如果没有就提示“没有这个数”。
    */ 

    // 1.顺序查找
    String[] names = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"}; //定义一个字符串数组，用来存放数列
    Scanner sc = new Scanner(System.in); //创建一个扫描器对象，用来接收键盘输入
    System.out.println("请输入要查找的名称:");
    String name = sc.nextLine(); //接收键盘输入的名称
    for(int i = 0; i < names.length; i++) {
      if(names[i].equals(name)) {
        System.out.println("找到，下标为:" + i);
        // return;
      }
    }

    // 2.二分查找
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
    System.out.println("请输入要查找的数:");
    int num = sc.nextInt();
    int index = 0;
    sc.nextLine(); // 消耗换行符
    int left = 0; //定义左边界
    int right = arr.length - 1; //定义右边界
    boolean flag = false;
    while(left <= right) {
      int mid = (left + right) / 2;//定义中间值
      index++;
      if (arr[mid] == num) {
        System.out.println("找到，下标为:" + mid);
        flag = true;
        break; //跳出循环
      }else if (arr[mid] < num) {
        left = mid + 1; //左边界向右移动
      }else {
        right = mid - 1; //右边界向左移动
      }
    }
    System.out.println("查找次数为:" + index);
    if (!flag) {
      System.out.println("没有这个数");
    }


  }
}
