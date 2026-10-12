package 跳转语句;
// 跳转控制语句-break
// javac encoding UTF-8 BreakExercise.java
// java BreakExercise
import java.util.Scanner;
public class BreakExercise {
  public  static void main(String[] args) {
    //1. 1-100以内的数求和，求出 当和第一次大于20的当前数【for+break】 
  int sum = 0;
  for(int i = 1; i<=100; i++) {
    sum += i;
    if (sum > 20) {
      System.out.println("当前数：" + i);
      break;
    }
  }

  // 实现登录验证，有3次机会，如果用户名为"丁真”，密码"666"提示登录成功，否则提示还有几次机会，请使用for+break完成
  int count = 3;
  Scanner scanner = new Scanner(System.in);
  for(int i = 1; i <= count; i++) {
    System.out.println("请输入第" + i + "次登录的用户名:");
    String name = scanner.next();
    System.out.println("请输入第" + i + "次登录的密码:");
    String password = scanner.next();
    if(name.equals("丁真") && password.equals("666")) {
      System.out.println("登录成功");
      break;
    }else {
      System.out.println("登录失败，还有" + (count - i) + "次机会");
    }
  }

  } 
}
