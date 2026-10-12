import  java.util.Scanner;
public class Array02 {
  public static void main(String[] args) {
    // 演示 数据类型 数组名[]=new数据类型[大小]
    // 循环输入5个成绩，保存到double数组，并输出

    //步骤
    //1.创建一个 double数组，大小5
    double[] scores = new double[5];
    // 循环输入
    // scores.length表示数组的大小/长度
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < scores.length; i++) {
      System.out.println("请输入第" + (i+1) + "个成绩:");
      scores[i] = sc.nextDouble();
    }
    //2.输出
    for(int i = 0; i < scores.length; i++) {
      System.out.println("第" + (i+1) + "个成绩为:" + scores[i]);
    }
  }
}
