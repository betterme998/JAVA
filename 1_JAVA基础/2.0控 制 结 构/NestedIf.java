// 嵌套分支。
/*
根据淡旺季的月份和年龄，打印票价[课后练习]
出票系统:
4-10 旺季:
成人(18-60) :60
儿童(<18):半价
老人(>60):1/3

淡季:
成人:40
其他:20
*/ 
import java.util.Scanner;
public class NestedIf {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 接收用户输入
    System.out.println("请输入月份");
    int month = scanner.nextInt();
    System.out.println("请输入年龄");
    int age = scanner.nextInt();

    if (month <= 12 && month > 0) {
      if (month >= 4 && month <= 10) { // 旺季
        // 成人票
        if (age > 18 && age < 60) {
          System.out.println(60);
        } else if (age < 18) { // 儿童
          System.out.println(30);
        } else { // 老人
          System.out.println(20);
        }
      } else { // 淡季
        if (age > 18) {
          System.out.println(40);
        } else {
          System.out.println(20);
        }
      }
    } else {
      System.out.println("输入的月份不合法");
    }
    scanner.close();

    
  }
}
