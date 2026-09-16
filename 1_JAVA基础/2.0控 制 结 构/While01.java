// while循环控制
// 编码 javac -encoding UTF-8 While01.java
// 运行 java While01
public class While01 {
  // 编写一个main方法
  public static void main(String[] args) {
    // 输出10句 你好
    int i = 1;
    while (i <= 10) { // 循环条件
      System.out.println("你好");
      i++;
    }
    System.out.println("退出while");
    // 1.打印1一100之间所有能被3整除的数[使用while，老师评讲]1.
    int j = 1;
    while (j <= 100) {
      if (j % 3 == 0) {
        System.out.println(j);
      }
      j++;
    }

    // 2.打印40一200之间所有的偶数[使用while，课后练习]2.
    int k = 40;
    while (k <= 200) {
      System.out.println(k);
      k +=2;
    }
  }
} 
