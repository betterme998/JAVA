//编码 javac -encoding UTF-8 RelationalOperator.java
//运行 java RelationalOperator
/**
 * # 关系运算符(比较运算符)
 * 1.关系运算符的结果都是boolean型，也就是要么是true，要么是false  
2.关系表达式 经常用在 if结构的条件中或循环结构的条件中

1.==  
2.!=  
3.<  
4.>  
5.<=  
6.>=  
7.instanceof 用于判断左边的对象是否是右边的类型的实例
 * **/ 
public class RelationalOperator {
  // 编写一个main方法
  public static void main(String[] args) {
    int a = 9;
    int b = 8;
    System.out.println(a > b);//T
    System.out.println(a >= b);//T
    System.out.println(a <= b);//F
    System.out.println(a < b);//F
    System.out.println(a == b);//F
    System.out.println(a != b);//T
    boolean flag = a>b;//T
    System.out.println(flag);//T
  }
}
