// if的快速入门
// 编码 javac -encoding UTF-8 If1.java
// 运行 java If1
/* 
信用分为100分时，输出 信用极好
信用分为(80，99]时，输出 信用优秀;
信用分为[60,80]时，输出 信用一般;
其它情况输出 信用 不及格
请从键盘输入保国的芝麻信用分，并加以判断假定信用分数为int
*/ 
import java.util.Scanner;
public class If1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 接收用户输入
    System.out.println("请输入信用分");
    int grade = scanner.nextInt();

    // 因为有4种情况，所以使用多分支
    if (grade == 100) {
      System.out.println("信用极好!");
    } else if (grade > 80 && grade <= 99) {
      System.out.println("信用优秀!");
    } else if (grade >= 60 && grade <= 80) {
      System.out.println("信用一般!");
    } else {
      System.out.println("信用不及格!");
    }
    scanner.close(); 



  }
}
