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
        return;
      }
    }
  }
}
