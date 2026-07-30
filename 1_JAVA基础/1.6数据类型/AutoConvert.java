//编码 javac -encoding UTF-8 AutoConvert.java
//运行 java AutoConvert
// 基本数据类型转换
/*
自动类型转换  
当java程序在进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型这个就是自动类型转换。  
数据类型按精度(容量)大小排序为(背，规则)  
char->int->long->float->double  
byte->short->char->int->long->float->double

自动类型转换使用和细节  
1.有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算  

2.当我们把精度(容量)大 的数据类型赋值给精度(容量)小 的数会报错，反之就会进行自动类型转换。

3.(byte,short)和 char之间不会相互自动转换。

5.boolean 不参与转换

6.自动提升原则: 表达式结果的类型自动提升为操作数中最大的类型
*/ 
public class AutoConvert {
  public static void main(String[] args) {
    // 演示自动转换
    int num = 'a';//ok char -> int
    double d1 = 80; //ok int -> double
    System.out.println(num);//97
    System.out.println(d1);//80.0

    // 细节1.有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算  
    int n1 = 10; //ok
    // float f1 = n1 + 1.1; //错误 n1 + 1.1 => 结果类型是double
    float f2 = n1 + 1.1f; //ok n1 => int -> float -> f2
    double d2 = n1 + 1.1; 

    //细节2.当我们把精度(容量)大 的数据类型赋值给精度(容量)小 的数据类型时
    //就会报错，反之就会进行自动类型转换。
    // int n2 = 1.1; // 错误 double -> int

    // 细节3.(byte,short)和 char之间不会相互自动转换。
    //当把数赋给 byte 时，（1）先判断该数是否在byte范围内，如果是就可以
    byte b3 = 10; //对， -128-127
    // int n2 = 1;
    // byte b4 = n2; 错误 原因:如果是变量赋值，判断类型

    // char c1 = b3; 错误 原因 byte 不能自动转成 char

    // 细节4.

  }
}
