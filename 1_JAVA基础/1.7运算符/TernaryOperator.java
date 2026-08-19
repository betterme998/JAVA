// 三元运算符使用
//编码 javac -encoding UTF-8 TernaryOperator.java
//运行 java TernaryOperator
public class TernaryOperator {
  // 编写一个main方法
  public static void main(String[] args) {
    int a = 10;
    int b = 99;
    // 解读
    //1.a > b 为false
    // 2.返回b--,先返回b的值，然后在b-1
    // 3.结果是99
    int result = a > b ? a++ : b--;
    System.out.println("result=" + result);
    System.out.println("a=" + a);//10
    System.out.println("b=" + b);//98

    // 三元运算符细节
    // //表达式1和表达式2要为可以赋给接收变量的类型(或可以自动转换)
    int a1 = 3;
    int b1 = 8;
    int c1 = a1 > b1 ? (int)1.1 : (int)3.4; //可以的
    double d = a1 > b1 ? a1 : b1 + 3;//可以的，满足 int ->double
    System.out.println("c1=" + c1);

    /*
    运算符优先级  
1.上一行运算符总优先于下一行。  
2.只有单目运算符、赋值运算符是从右向左运算的。
. () {} ; ,  
++ -- ~ !(data type)   右向左
\* / %  
\+ -
<< >> >>> 位移  
< > <= >= instanceof  
== !=  
&  
^  
|  
&&  
||
? :  
= \*= /= %=   右向左
+= -+ <<= >>=  
.>>>= &= ^= |=
    */ 

  }
}
