// if的快速入门
// 编码 javac -encoding UTF-8 If0.java
// 运行 java If0
import java.util.Scanner;
public class If0 {
  public static void main(String[] args) {
    //编写一个程序,可以输入人的年龄,如果该同志的年龄大于18岁，
    //则输出“你年龄大于18,要对自己的行为负责,送入监狱”
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入年龄");
    int age = scanner.nextInt();//获取用户输入的数字
    if (age > 18) {
      System.out.println("你年龄大于18,要对自己的行为负责,送入监狱");
    }
    scanner.close();

    if (age < 18) {
      System.out.println("你年龄小于18,请勿入内");
    } else {
      System.out.println("你年龄大于等于18,欢迎进入");
    }



  }
}
