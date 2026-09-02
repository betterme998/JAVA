// 编码 javac -encoding UTF-8 Switch01.java
// 运行 java Switch01
/*
请编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g
a表示星期一，b表示星期二.
根据用户的输入显示相应的信息.要求使用 switch 语句完成
*/ 
import java.util.Scanner;
public class Switch01 {
  public static void main(String[] args) {

    /*
    1.接收一个字符，创建Scanner对象
    2.使用switch 来完成匹配,并输出对应信息
    */ 
   Scanner sc = new Scanner(System.in);
   System.out.println("请输入一个字符");
   char day = sc.next().charAt(0);//字符串转字符
   switch (day) {
    case 'a': 
      System.out.println("星期一");
      break;
    case 'b':
      System.out.println("星期二");
      break;
    case 'c':
      System.out.println("星期三");
      break;
    case 'd':
      System.out.println("星期四");
      break;
    case 'e':
      System.out.println("星期五");
      break;
    case 'f':
      System.out.println("星期六");
      break;
    case 'g':
      System.out.println("星期日");
      break;
    default:
      System.out.println("输入的字符不合法");
      break;
   }

  //  细节一
  //表达式数据类型，应和case 后的常量类型一致，
  //或者是可以自动转成可以相互比较的类型，比如输入的是字符，而常量是 int
   char c = 'a';
   switch (c) {
    case 'a':
      System.out.println("星期一");
      break;
    case 20: //自动装箱，char 转 int 比较
      System.out.println("星期二");
      break;
    default:
      System.out.println("输入的参数不合法");
      break;
   }

   // 细节二
    //switch(表达式)中表达式的返回值必须是:
    // (byte,short,int,char,enum[枚举],String)
    double d = 1.1;
    // switch (d) { //错误，double 不可以
    //   case 1.1:
    //     System.out.println("1.1");
    //     break;
    //   default:
    //     System.out.println("不合法");
    //     break;
    // }

    //细节3
    //case子句中的值必须是常量,而不能是变量

    // 细节4
    // 4.default子句是可选的，当没有匹配的case时，执行default  

    // 细节5
    // 5.break语句用来在执行完一个case分支后使程序跳出switch语句块;如果没有写break，程序会顺序执行到switch结尾
  }
}
