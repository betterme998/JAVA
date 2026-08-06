
// 演示逻辑运算符的使用
// && 和 & 使用区别
//编码 javac -encoding UTF-8 LogiclOperator.java
//运行 java LogiclOperator

/*
# 逻辑运算符

用于连接多个条件(多个关系表达式),最终的结果也是一个boolean值

1.短路与 &&，短路或 ||，取反 !  
2.逻辑与 &，逻辑或|，^ 逻辑异或

1.短路指的是：当左边的操作数已经能决定整个表达式的最终结果时，程序将不会计算（“跳过”）右边的操作数。  
&&（短路与）：左边为 false，整体结果必为 false，右边被跳过。

||（短路或）：左边为 true，整体结果必为 true，右边被跳过。

2.逻辑异或  
“两个条件必须不同”

两边都为 true 或都为 false → 结果为 false。

两边一真一假 → 结果为 true。

特别注意：异或运算符 不支持短路，因为它必须知道两边的结果才能判断是否“不同”，所以左右两侧的代码一定会被执行。

短路：左边定结果，右边不执行（像“截断”了电路）。主要用于判空保护。

异或：两边必须执行，结果看是否“不一样”。主要用于判断二选一的场景。
*/ 
public class LogiclOperator {
  //编写一个main方法
  public static void main(String[] args) {
    //&&短路与 && 和&案例演示
    int age = 50;
    if (age > 20 && age < 30) {
      System.out.println("ok");
    }
    //&逻辑与使用
    if (age > 20 & age < 90) {
      System.out.println("ok2");
    }

    // 区别
    int a = 4;
    int b = 9;
    //对于&&短路与而言，如果第一个条件为false，后面的条件不再判断
    // //对于&逻辑与而言，如果第一个条件为false，后面的条件然会判断
    if (a < 1 && ++b < 50) {
      System.out.println("ok3");
    }
    System.out.println("a=" + a + "b=" + b);//a=4,b=9
    if (a < 1 & ++b < 50) {
      System.out.println("ok3");
    }
    //&的判断导致后面的++b执行了，所以b=10，a=4
    System.out.println("a=" + a + "b=" + b);

  }
}
