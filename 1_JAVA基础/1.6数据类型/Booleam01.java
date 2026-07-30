//编码 javac -encoding UTF-8 Booleam01.java
//运行 java Booleam01
/*
基本介绍  
1.布尔类型也叫boolean类型，booolean类型数据只允许取值true和false，无null  
2.boolean类型占1个字节  
3.boolean 类型适于逻辑运算，一般用于程序流程控制[这个后面会详细介绍]:  
.if条件控制语句;  
while循环控制语句;  
do-while循环控制语句;  
for循环控制语句

使用细节说明  
不可以0或非0的整数替代false和true，这点和C语言不同
*/ 
public class Booleam01 {
  public static void main(String[] args) {
    // 演示判断成绩是否通过的案例
    // 定义一个布尔变量
    boolean isPass = true;//
    if (isPass == true) {
      System.out.println("考试通过，恭喜");
    }else {
      System.out.println("考试没有通过，下次努力");
    }
  }
}
