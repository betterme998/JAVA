import java.util.Scanner;
public class SwitchExercise {
  public static void main(String[] args) {
    /*
    1.使用 switch 把小写类型的 char型转为大写(键盘输入)。只转换 a, b,c, d, e.其它的输出"other”
    2.对学生成绩大于60分的，输出"合格”低于60分的，输出"不合格"。(注:输入的成绩不能大于100)，提示 成绩/60
    3.根据用于指定月份，打印该月份所属的季节。3,4,5 春季 6,7,8 豆季 9,10,11秋季 12,1,2 冬季[课堂练习,提示 使用穿透]
    */ 
  //  1.
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个字符");
    char ch = sc.next().charAt(0);//获取键盘输入的第一个字符
    switch (ch) {
      case 'a':
        System.out.println("A");
        break;
      case 'b':
        System.out.println("B");
        break;
      case 'c':
        System.out.println("C");
        break;
      case 'd':
        System.out.println("D");
        break;
      case 'e':
        System.out.println("E");
        break;
      default:
        System.out.println("other");
        break;
    }
    // 2.对学生成绩大于60分的，输出"合格”低于60分的，输出"不合格"。(注:输入的成绩不能大于100)，提示 成绩/60
    System.out.println("请输入学生成绩0~100");
    int score = sc.nextInt();
    if (score < 0 || score > 100) {
      System.out.println("输入不合法 输入0-100");
      sc.close();

      return;
    }
    int level = score / 60;
    switch (level) {
      case 0 :
        System.out.println("不合格");
        break;
      case 1:
        System.out.println("合格");
        break;
      default:
        System.out.println("输入不合法");
        break;
    }
    

    // 3.根据用于指定月份，打印该月份所属的季节。3,4,5 春季 6,7,8 豆季 9,10,11秋季 12,1,2 冬季[课堂练习,提示 使用穿透]
    System.out.println("请输入一个数字");
    int month = sc.nextInt();
    if (month < 1 || month > 12) {
      System.out.println("输入不合法 输入1-12");
      sc.close();
      return;
    }
    switch (month) {
      case 3:
      case 4:
      case 5:
        System.out.println("春季");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("豆季");
        break;
      case 9:
    }

  }
}
