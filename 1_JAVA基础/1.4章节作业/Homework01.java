/*
//编码 javac -encoding UTF-8 Homework01.java
//运行 java Homework01

1.编写hello,world程序[Homework01.java]
2.将个人的基本信息(姓名、性别、籍贯、住址)打印到控制台上输出。各条信息分别占一行。[Homework02.java]
3.JDK,JRE,JVM的关系 [Homework03.java] 简答题
4.环境变量path配置及其作用[Homework04.java]
5.Java编写步骤[Homework05.java]
6.Java编写7个规范 [Homework06.java]
7.初学者iava易犯错误 [Homework07.java]
*/
public class Homework01 {
  public static void main(String[] args) {
    // 1.编写hello,world程序[Homework01.java]
    System.out.println("Hello,world!");

    // 2.将个人的基本信息(姓名、性别、籍贯、住址)打印到控制台上输出。各条信息分别占一行。[Homework02.java].
    System.out.println("姓名\t性别\t籍贯\t地址\n张三\t男\t江西\t江西");

    
    /*
    // 3.JDK,JRE,JVM的关系 [Homework03.java] 简答题
    1.JDK = JRE + java开发工具
    2.JRE = JVM + 核心类库

    4.环境变量path配置及其作用[Homework04.java]
    1.环境变量的作用是为了在dos的任意目录，可以去使用java 和 javac命命
    2.先配置 JAVAHOME = 指向jdk安装的主目录
    3.编辑path环境变量，增加 %AVA HOME%\bin

    5.Java编写步骤[Homework05.java]
    1.编写java的源代码
    2.javac 编译,得到对应的.class 字节码文件
    3.java 运行，本质就是把.class 加载到jvm 运行

    6.Java编写7个规范 [Homework06.java]
    1.类,方法的注释，使用javadoc的方式，即文档注释
    2.非javadoc注释，往往是对代码的说明(给程序的维护者),说明如何修改，注意事项
    3.使用tab ，整体将代码右移，使用shift+tab 整体左移
    4.运算符和 = 的两边，给空格，代码看上去清楚 int n = 1 + 4;
    5.源码文件使用 utf-8编码
    6.行宽字符不要超过 80
    7.代码编程风格有两种 次行风格，行尾风格(推荐)

    7.初学者iava易犯错误 [Homework07.java]
    1.编译或者运行时，找不到文件 javac Hell0.java，把文件名或者目录找对
    2.主类名和文件名不一致修改时保持一致即可
    3.缺少;
    4.拼写错误，比如1-> l 0->o，void -> viod 要求写代码时，一定要小心
    */ 
  }
}
