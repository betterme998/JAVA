/*

//编码 javac -encoding UTF-8 Var01.java
//运行 java Var01
变量介绍  
为什么需要变量：一个程序就是一个世界  
变量是程序的基本组成单位  
不论是使用哪种高级程序语言编写程序,变量都是其程序的基本组成单位，比如:  
//变量有三个基本要素(类型+名称+值)

变量相当于内存中一个数据存储空间的表示，你可以把变量看做是一个房间的门
牌号，通过门牌号我们可以找到房间，而通过变量名可以访问到变量(值)。

变量使用的基本步骤  
1)声明变量  
int a;  
2)赋值a = 60；  
3)使用 System.out.println(a);  
//也可以一步到位[int a = 60; 通常我们是一步完成]
*/ 
public class Var01 {
  //编写一个main方法
  public static void main(String[] args) {
    //声明变量
    int a;
    a = 100;
    System.out.println(a);

    // 还可以这样使用
    int b = 800;
    System.out.println(b);

    // 变量使用入门案例看演示井对代码进行说明， 演示记录 人的信息的代码
    // 变量命名规范
    int age = 20; // 整数类型

    double score = 88.9; // 浮点类型
    char gender = '男'; // 字符类型
    String name = "张三"; // 字符串类型
    System.out.println("人的信息如下:");    
    System.out.println("年龄:" + age);
    System.out.println("成绩:" + score);
    System.out.println("性别:" + gender);
    System.out.println("姓名:" + name);

    /*
    变量使用注意事项
    1.变量表示内存中的一个存储区域[不同的变量,类型不同，占用的空间大小不同比如:int 4 个字节， double 就是 8个字节]  
    2.该区域有自己的名称[变量名]和类型[数据类型]
    3.变量必须先声明，后使用,即有顺序
    4.该区域的数据可以在同一类型范围内不断变化
    5.变量在同一个作用域内不能重名
    6.变量=变量名+值+数据类型，这一点请大家注意。变量三要素
    */ 

    // 程序中 +号的使用  
    // 1.当左右两边都是数值型时，则做加法运算
    // 2.当左右两边有一方为字符串，则做拼接运算
    // 3.课堂测试题 1min
    System.out.println(100 + 98); //198
    System.out.println("100" + 98);//10098
    System.out.println(100 + 3 + "hello");//103hello;
    System.out.println("hello" + 100 + 3);//hello1003;

    // 数据类型
  }
}